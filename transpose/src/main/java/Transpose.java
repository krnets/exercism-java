import java.util.ArrayList;
import java.util.stream.Stream;

public class Transpose {
    public String transpose(String input) {

        var arr = input.split("\n");
        var list = new ArrayList<String>();

        int nRows = Stream.of(arr).mapToInt(String::length).max().orElse(0);
        int nCols = arr.length;

        for (int i = 0; i < nRows; i++) {
            var sb = new StringBuilder();

            for (int j = 0; j < nCols; j++) {
                var c = arr[j].length() > i ? arr[j].charAt(i) : ' ';
                sb.append(c);
            }
            list.add(sb.toString());

            while (nCols > 0 && arr[nCols - 1].length() <= i + 1)
                nCols--;
        }
        return String.join("\n", list);
    }
}
