/*
import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

    String acronym;

    Acronym(String phrase) {
        acronym = Arrays.stream(phrase.replaceAll("[-_]+", " ").split("\\s+"))
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
    }

    String get() {
        return acronym.toUpperCase();
    }

}
*/
