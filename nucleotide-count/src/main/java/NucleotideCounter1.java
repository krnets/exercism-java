/*
import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('G', 0);
        map.put('A', 0);
        map.put('T', 0);
        map.put('C', 0);
    }

    public NucleotideCounter(String input) {
        for (Character c : input.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else throw new IllegalArgumentException();
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return map;
    }
}
*/
