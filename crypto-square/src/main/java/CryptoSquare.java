public class CryptoSquare {

    private final String plaintext;

    public CryptoSquare(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getCiphertext() {
        if (plaintext.isEmpty()) return "";

        var str = plaintext.replaceAll("\\W", "").toLowerCase();
        var sqRoot = Math.sqrt(str.length());
        int rows = (int) (str.length() < 10 ? Math.ceil(sqRoot) : sqRoot);
        int columns = (int) Math.ceil(sqRoot);
        int padding = rows * columns - str.length();
        str += " ".repeat(padding);
        var sb = new StringBuilder();

        var matrix = new char[rows][columns];
        var transposed = new char[columns][rows];

        for (int i = 0, j = 0; i < rows; i++, j += columns) {
            matrix[i] = str.substring(j, j + columns).toCharArray();
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        for (char[] chars : transposed) {
            sb.append(new String(chars)).append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}

