/*
import java.util.HashMap;
import java.util.Map;

class Scrabble {
    Map<Character, Integer> POINTS = new HashMap<>();
    char[] chars;
    int score;

    Scrabble(String word) {
        chars = word.toUpperCase().toCharArray();

        POINTS.put('A', 1);
        POINTS.put('E', 1);
        POINTS.put('I', 1);
        POINTS.put('O', 1);
        POINTS.put('U', 1);
        POINTS.put('L', 1);
        POINTS.put('N', 1);
        POINTS.put('R', 1);
        POINTS.put('S', 1);
        POINTS.put('T', 1);
        POINTS.put('D', 2);
        POINTS.put('G', 2);
        POINTS.put('B', 3);
        POINTS.put('C', 3);
        POINTS.put('M', 3);
        POINTS.put('P', 3);
        POINTS.put('F', 4);
        POINTS.put('H', 4);
        POINTS.put('V', 4);
        POINTS.put('W', 4);
        POINTS.put('Y', 4);
        POINTS.put('K', 5);
        POINTS.put('J', 8);
        POINTS.put('X', 8);
        POINTS.put('Q', 10);
        POINTS.put('Z', 10);
    }

    int getScore() {
        for (char c : chars) {
            score += POINTS.getOrDefault(c, 0);
        }
        return score;
    }

}
*/
