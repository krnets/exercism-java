import java.util.*;

class Matrix {
    private final List<List<Integer>> matrix;

    Matrix(List<List<Integer>> values) {
        this.matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        var set = new HashSet<MatrixCoordinate>();

        for (int i = 0; i < matrix.size(); i++) {
            int rowMax = Collections.max(matrix.get(i));

            for (int j = 0; j < matrix.get(i).size(); j++)
                if (matrix.get(i).get(j) == rowMax) {
                    int colMin = matrix.get(i).get(j);

                    for (var row : matrix) {
                        if (row.get(j) < rowMax)
                            colMin = row.get(j);
                    }
                    if (rowMax == colMin) {
                        set.add(new MatrixCoordinate(i + 1, j + 1));
                    }
                }
        }
        return set;
    }
}
