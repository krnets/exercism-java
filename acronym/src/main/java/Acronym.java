import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Acronym {

    String acronym;
    Pattern P = Pattern.compile("[\\s_-]+");

    Acronym(String phrase) {
        this.acronym = P.splitAsStream(phrase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
    }

    String get() {
        return acronym.toUpperCase();
    }

}
