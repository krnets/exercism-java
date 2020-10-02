import java.util.HashMap;
import java.util.Map;

class Scrabble {
    int score;
    int[] chars;
    static Map<Integer, Integer> POINTS = new HashMap<>();

    static {
        fillPointsMap("AEIOULNRST", 1);
        fillPointsMap("DG", 2);
        fillPointsMap("BCMP", 3);
        fillPointsMap("FHVWY", 4);
        fillPointsMap("K", 5);
        fillPointsMap("JX", 8);
        fillPointsMap("QZ", 10);
    }

    static void fillPointsMap(String letters, int score) {
        letters.chars().forEach(c -> POINTS.put(c, score));
    }

    Scrabble(String word) {
        chars = word.toUpperCase().chars().toArray();
    }

    int getScore() {
        for (int c : chars) {
            score += POINTS.getOrDefault(c, 0);
        }
        return score;
    }

}
