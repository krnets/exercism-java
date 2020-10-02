/*
import java.util.LinkedHashMap;

class RaindropConverter {

    String convert(int number) {
        var sb = new StringBuilder();
        var map = new LinkedHashMap<Integer, String>();

        map.put(3, "Pling");
        map.put(5, "Plang");
        map.put(7, "Plong");

        for (var e : map.entrySet()) {
            if (number % e.getKey() == 0)
                sb.append(e.getValue());
        }

        return sb.length() > 0 ? sb.toString() : String.valueOf(number);
    }
}
*/
