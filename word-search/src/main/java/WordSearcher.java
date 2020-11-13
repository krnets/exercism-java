import java.util.*;
import java.util.stream.Collectors;

public class WordSearcher {

    private static final List<Pair> directions = Arrays.asList(
            new Pair(1, 0),   // N
            new Pair(1, 1),   // NE
            new Pair(0, 1),   // E
            new Pair(-1, 1),  // SE
            new Pair(-1, 0),  // S
            new Pair(-1, -1), // SW
            new Pair(0, -1),  // W
            new Pair(1, -1)   // NW
    );

    public Map<String, Optional<WordLocation>> search(Set<String> searchWords, char[][] charsMatrix) {

        return searchWords.stream()
                .collect(Collectors.toMap(i -> i,
                        word -> search(word, charsMatrix)));
    }

    private Optional<WordLocation> search(String word, char[][] charsMatrix) {

        var max = new Pair(charsMatrix[0].length, charsMatrix.length);

        for (int i = 0; i < charsMatrix.length; i++) {
            for (int j = 0; j < charsMatrix[0].length; j++) {
                if (charsMatrix[i][j] == word.charAt(0)) {

                    for (Pair direction : directions) {
                        var from = new Pair(j + 1, i + 1);
                        var to = from.plus(direction.times(word.length() - 1));

                        if (to.within(max) && canTrace(word, from, direction, charsMatrix)) {
                            return Optional.of(new WordLocation(from, to));
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }

    private boolean canTrace(String word, Pair from, Pair direction, char[][] charsMatrix) {

        for (char c : word.toCharArray()) {
            if (charsMatrix[from.getY() - 1][from.getX() - 1] != c) {
                return false;
            }
            from = from.plus(direction);
        }
        return true;
    }
}