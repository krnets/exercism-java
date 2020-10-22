/*
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class Atbash {

    public String encode(String str) {
        String s = decode(str.toLowerCase());
        String[] parts = s.split("(?<=\\G.{5})");
        return String.join(" ", parts);
    }

    public String decode(String str) {
        return str.chars()
                .filter(Character::isLetterOrDigit)
                .map(transposeChar)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }

    private final IntUnaryOperator transposeChar = c -> {
        if (Character.isLetter(c)) return 'a' + ('z' - c);
        else return c;
    };
}
*/
