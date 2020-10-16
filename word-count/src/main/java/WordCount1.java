/*
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

    public Map<String, Integer> phrase(String str) {
        String[] words = str.toLowerCase()
                .replaceAll("[^\\w\\d']+", " ")
                .trim()
                .split("\\s+");

        return Stream.of(words)
                .map(w -> w.replaceAll("^'|'$", ""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue)));
    }
}*/
