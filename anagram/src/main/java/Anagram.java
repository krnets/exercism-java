import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Anagram {

    private final String input;
    private final int[] target;

    public Anagram(String input) {
        this.input = input.toLowerCase();
        target = this.input.chars().sorted().toArray();
    }

    public List<String> match(List<String> list) {
        return list.stream()
                .filter(Predicate.not(this::identical))
                .filter(this::isAnagram)
                .collect(Collectors.toList());
    }

    private boolean isAnagram(String s) {
        int[] cmp = s.toLowerCase().chars()
                .sorted()
                .toArray();

        return Arrays.equals(target, cmp);
    }

    private boolean identical(String s) {
        return input.equals(s.toLowerCase());
    }
}
