/*
import java.util.ArrayList;
import java.util.List;

public class Flattener {
    public static List<Object> flatten(List list) {
        List<Object> result = new ArrayList<>();

        for (Object o : list) {
            if (o instanceof List)
                result.addAll(flatten((List) o));
            else if (o != null)
                result.add(o);
        }
        return result;
    }
}*/
