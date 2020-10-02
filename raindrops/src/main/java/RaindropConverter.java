import java.util.HashMap;
import java.util.LinkedHashMap;

public class RaindropConverter {

    private static final HashMap<Integer, String> MAP = new LinkedHashMap<>();

    static {
        MAP.put(3, "Pling");
        MAP.put(5, "Plang");
        MAP.put(7, "Plong");
    }


    public String convert(int number) {

        return MAP.keySet()
                .stream()
                .filter(key -> number % key == 0)
                .map(MAP::get)
                .reduce((s1, s2) -> s1 + s2)
                .orElse(Integer.toString(number));
    }

}