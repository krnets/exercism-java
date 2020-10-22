public class SpiralMatrixBuilder {
    public int[][] buildMatrixOfSize(int size) {

        int[][] matrix = new int[size][size];
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = size - 1;
        int colEnd = size - 1;

        int n = 1;
        int nSquared = size * size;

        while (n <= nSquared) {

            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = n++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = n++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                matrix[rowEnd][i] = n++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = n++;
            }
            colStart++;
        }

        return matrix;
    }
}