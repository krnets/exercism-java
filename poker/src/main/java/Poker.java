import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Poker {

    private final List<String> hands;
    private final int N = 5;
    private final Map<Character, Integer> rankValues = new HashMap<>();

    {
        IntStream.rangeClosed(2, 9).forEach(i -> rankValues.put((char) ('0' + i), i));

        rankValues.put('T', 10);
        rankValues.put('J', 11);
        rankValues.put('Q', 12);
        rankValues.put('K', 13);
        rankValues.put('A', 14);
    }

    public Poker(List<String> hands) {
        this.hands = hands;
    }

    public List<String> getBestHands() {
        int maxHandValue = 0;

        for (String hand : hands) {
            int currentHandValue = getValue(hand);
            maxHandValue = Math.max(currentHandValue, maxHandValue);
        }

        int finalMaxHandValue = maxHandValue;

        return hands.stream()
                .filter(hand -> getValue(hand) == finalMaxHandValue)
                .collect(Collectors.toList());
    }

    private int getValue(String hand) {
        var cards = Arrays.stream(hand.split(" "))
                .map(c -> c.replace("10", "T"))
                .sorted(Comparator.comparingInt(c -> rankValues.get(c.charAt(0))))
                .collect(Collectors.toList());

        var groupingBy = cards.stream()
                .map(c -> c.charAt(0))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        boolean isOnePair = groupingBy.containsValue(2L);
        boolean isTwoPair = groupingBy.entrySet().stream().filter(e -> e.getValue() == 2L).count() == 2;
        boolean isThreeOfAKind = groupingBy.containsValue(3L);
        boolean isStraight = checkStraight(cards);
        boolean isFlush = checkFlush(cards);
        boolean isFullHouse = groupingBy.containsValue(2L) && groupingBy.containsValue(3L);
        boolean isFourOfAKind = groupingBy.containsValue(4L);
        boolean isStraightFlush = isStraight && isFlush;
        boolean isFiveOfAKind = groupingBy.getOrDefault('A', 0L) == 4 && groupingBy.containsKey('J')
                || groupingBy.containsValue(5L);

        if (isFiveOfAKind) {
            return 900 + highCard(cards);
        }

        if (isStraightFlush) {
            return 800 + highCard(cards);
        }

        if (isFourOfAKind) {
            var fourOfAKind = groupingBy.entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 4)
                    .map(Map.Entry::getKey)
                    .findFirst().orElse(' ');

            return 700 + highCard(cards) + 4 * rankValues.get(fourOfAKind);
        }

        if (isFullHouse) {
            var threeOfAKind = groupingBy.entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 3)
                    .map(Map.Entry::getKey)
                    .findFirst().orElse(' ');

            var highPair = groupingBy.entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 2)
                    .map(Map.Entry::getKey)
                    .findFirst().orElse(' ');

            return 600 + 3 * rankValues.get(threeOfAKind) + 2 * rankValues.get(highPair);
        }

        if (isFlush) {
            return 500 + highCard(cards);
        }

        if (isStraight) {
            int lastCardIndex = (cards.get(N - 1).charAt(0) == 'A') ? N - 2 : N - 1;

            return 400 + rankValues.get(cards.get(lastCardIndex).charAt(0));
        }

        if (isThreeOfAKind) {
            var threeOfAKind = groupingBy.entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 3)
                    .map(Map.Entry::getKey)
                    .findFirst().orElse(' ');

            var cardsExcludingThree = cards.stream()
                    .filter(Predicate.not(c -> c.charAt(0) == threeOfAKind))
                    .collect(Collectors.toList());

            return 300 + highCard(cardsExcludingThree) + rankValues.get(threeOfAKind);
        }

        if (isTwoPair) {
            var highPair = groupingBy.entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 2)
                    .map(Map.Entry::getKey)
                    .max(Comparator.comparingInt(rankValues::get)).orElse(' ');

            return 200 + 2 * rankValues.get(highPair) + lowCard(cards);
        }

        if (isOnePair) {
            return 100 + groupingBy.entrySet().stream()
                    .filter(e -> e.getValue() == 2)
                    .mapToInt(e -> rankValues.get(e.getKey()))
                    .sum();
        }

        return highCard(cards) + lowCard(cards);
    }

    private int lowCard(List<String> cards) {
        return rankValues.get(cards.get(0).charAt(0));
    }

    private boolean checkFlush(List<String> cards) {
        return cards.stream().allMatch(c -> cards.get(0).charAt(1) == c.charAt(1));
    }

    private int highCard(List<String> cards) {
        return rankValues.get(cards.get(cards.size() - 1).charAt(0));
    }

    private boolean checkStraight(List<String> cards) {
        int count = 0;

        if (cards.get(N - 1).charAt(0) == 'A' && cards.get(0).charAt(0) == '2') {
            var c = cards.get(N - 1);
            cards.remove(c);
            cards.add(0, c);
        }

        for (int i = 1; i < N; i++) {
            var prevRank = cards.get(i - 1).charAt(0);
            var currRank = cards.get(i).charAt(0);
            int previous = 1;

            if (prevRank != 'A' && currRank != '2') previous = rankValues.get(prevRank);
            var current = rankValues.get(currRank);

            if (current - previous == 1) count++;
            else break;
        }
        return count == 4;
    }

}
