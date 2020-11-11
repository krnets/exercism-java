import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.regex.Pattern;

public class GrepTool {

    public String grep(String searchingFor, Collection<String> flags, Collection<String> files) {

        boolean invertMatch = flags.contains("-v");
        boolean printFilenames = flags.contains("-l");
        boolean matchEntireLine = flags.contains("-x");
        boolean ignoreCase = flags.contains("-i");
        boolean showLineNumbers = flags.contains("-n");
        boolean multipleFiles = files.size() > 1;

        var regex = Pattern.compile(searchingFor, ignoreCase ? Pattern.CASE_INSENSITIVE : 0);
        var result = new ArrayDeque<CharSequence>();

        for (String filename : files) {
            try {
                var lines = Files.readAllLines(Path.of(filename));
                int lineNumber = 0;

                for (String line : lines) {
                    var matcher = regex.matcher(line);
                    lineNumber++;

                    if (invertMatch ^ (matchEntireLine ? matcher.matches() : matcher.find())) {
                        if (printFilenames) {
                            result.add(filename);
                            break;

                        } else {
                            var sb = new StringBuilder();

                            if (multipleFiles) sb.append(filename).append(":");
                            if (showLineNumbers) sb.append(lineNumber).append(":");

                            result.add(sb.append(line));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return String.join("\n", result);
    }
}

