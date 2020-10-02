import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ResistorColorDuo {
    List<String> ringColors = List
            .of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    int value(String[] colors) {
        String result = Arrays.stream(colors)
                .map(x -> ringColors.indexOf(x))
                .limit(2)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(result);
    }
}
