import java.util.stream.IntStream;
import java.util.stream.Stream;

class Matrix {
    int[][] matrix;

    Matrix(String matrixAsString) {
        matrix = Stream.of(matrixAsString.split("\n"))
                .map(row -> Stream.of(row.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);
    }

    private int[] transposeColumn(int[][] matrix, int i) {
        return IntStream.range(0, matrix.length)
                .map(j -> matrix[j][i])
                .toArray();
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        return transposeColumn(matrix, columnNumber - 1);
    }
}
