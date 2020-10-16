import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {
    public static List<Object> flatten(List<Object> list) {
        return list.stream()
                .flatMap(x -> x instanceof List ? flatten((List<Object>) x).stream() : Stream.of(x))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
