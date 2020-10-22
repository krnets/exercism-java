import java.util.regex.Pattern;

public class RunLengthEncoding {

    public String encode(String s) {
        if (s.isEmpty()) {
            return s;
        }
        var sb = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            var currChar = s.charAt(i);

            if (i + 1 < s.length() && currChar == s.charAt(i + 1)) {
                counter++;
            } else {
                if (counter > 1) {
                    sb.append(counter);
                }
                sb.append(currChar);
                counter = 1;
            }
        }
        return sb.toString();
    }

    public String decode(String s) {
        if (s.isEmpty()) {
            return s;
        }
        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                var n = Pattern.compile("(\\d+)")
                        .matcher(s.substring(i))
                        .results()
                        .findAny()
                        .get()
                        .group();

                var c = String.valueOf(s.charAt(i + n.length()));
                sb.append(c.repeat(Integer.parseInt(n)));
                i += n.length();

            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
