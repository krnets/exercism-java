import java.util.Map;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {
    Pattern TOKENS = Pattern.compile("[\\w]+('[\\w]+)*");

    public Map<String, Integer> phrase(String str) {
        return TOKENS.matcher(str)
                .results()
                .map(MatchResult::group)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors
                        .collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}
