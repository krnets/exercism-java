import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int nLetters = a - 'A' + 1;
        int gridSize = 2 * (nLetters - 1) + 1;

        String[] lines = new String[gridSize];

        for (int i = 0; i < nLetters; i++) {
            char[] lineElems = new char[gridSize];

            Arrays.fill(lineElems, ' ');

            char c = (char) ('A' + i);
            int leftPos = gridSize / 2 - i;
            int rightPos = gridSize - leftPos - 1;

            lineElems[leftPos] = c;
            lineElems[rightPos] = c;

            String s = new String(lineElems);

            lines[i] = s;
            lines[gridSize - i - 1] = s;
        }

        return Arrays.asList(lines);
    }
}