import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Series {

    private final String numStr;

    public Series(String numStr) {
        this.numStr = numStr;
    }

    public List<String> slices(int n) {
        if (n < 1)
            throw new IllegalArgumentException("Slice size is too small.");

        if (n > numStr.length())
            throw new IllegalArgumentException("Slice size is too big.");

        return IntStream.rangeClosed(0, numStr.length() - n)
                .mapToObj(i -> numStr.substring(i, i + n))
                .collect(Collectors.toList());
    }
}