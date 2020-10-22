import java.util.Map;
import java.util.stream.Collectors;

public class ParallelLetterFrequency {

    private final String input;

    public ParallelLetterFrequency(String input) {
        this.input = input;
    }

    public Map<Integer, Integer> letterCounts() {
        return input.chars()
                .parallel()
                .boxed()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingByConcurrent(i -> i,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue)));
    }
}