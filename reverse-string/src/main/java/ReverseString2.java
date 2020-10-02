/*
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ReverseString {

    String reverse(String inputString) {
        return IntStream.range(0, inputString.length())
                .mapToObj(i -> inputString.charAt(inputString.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
*/
