/*
import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

    String acronym;

    Acronym(String phrase) {
        acronym = Arrays.stream(phrase.split("[\\s_-]+"))
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
    }

    String get() {
        return acronym.toUpperCase();
    }

}
*/
