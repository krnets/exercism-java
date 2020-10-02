/*
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PangramChecker {

    public boolean isPangram(String input) {
        var alphabet = IntStream.range(0, 26)
                .map(i -> 'a' + i)
                .boxed()
                .map(Character::toString)
                .collect(Collectors.joining());

        var stringCompare = input.toLowerCase()
                .chars()
                .distinct()
                .filter(Character::isLetter)
                .sorted()
                .boxed()
                .map(Character::toString)
                .collect(Collectors.joining());

        return alphabet.equals(stringCompare);
    }

}
*/
