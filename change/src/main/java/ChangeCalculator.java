import java.util.*;

public class ChangeCalculator {
    List<Integer> coins;

    ChangeCalculator(List<Integer> coins) {
        this.coins = coins;
    }

    List<Integer> computeMostEfficientChange(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative totals are not allowed.");
        }

        var valueCoinsMap = new HashMap<Integer, List<Integer>>();
        valueCoinsMap.put(0, Collections.emptyList());

        var queue = new LinkedList<Integer>();
        queue.offer(0);

        while (!queue.isEmpty()) {
            int value = queue.poll();

            if (value == amount) {
                return valueCoinsMap.get(value);
            }

            for (int coin : coins) {
                int nextValue = value + coin;

                if (nextValue > amount) {
                    break;
                }

                if (!valueCoinsMap.containsKey(nextValue)) {
                    var coinsChange = new ArrayList<>(valueCoinsMap.get(value));
                    coinsChange.add(coin);

                    valueCoinsMap.put(nextValue, coinsChange);
                    queue.offer(nextValue);
                }
            }
        }

        throw new IllegalArgumentException(String.format("The total %d cannot be represented in the given currency.", amount));
    }
}
