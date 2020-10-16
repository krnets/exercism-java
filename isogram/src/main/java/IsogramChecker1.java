/*
import java.util.stream.Collectors;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        var counter = phrase.toLowerCase().replaceAll("\\W", "").chars().boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        return phrase.isEmpty() || counter.values().stream().allMatch(x -> x == 1);
    }

}
*/
