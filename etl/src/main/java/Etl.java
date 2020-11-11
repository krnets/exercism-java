import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Etl {
    Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (Map.Entry<Integer, List<String>> e : old.entrySet()) {
            var point = e.getKey();
            var list = e.getValue();

            list.stream().forEach(s -> map.put(s.toLowerCase(), point));
        }
        return map;
    }
}
