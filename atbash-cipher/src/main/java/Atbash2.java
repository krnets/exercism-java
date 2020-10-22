/*
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class Atbash {

    public String encode(String str) {
        return decode(str.toLowerCase())
                .replaceAll("(.{5})", "$1 ")
                .trim();
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
