/*
import java.util.ArrayList;
import java.util.List;

public class Queen {
    private final int row;
    private final int column;

    public Queen(int row, int column) {
        if (row < -1) {
            throw new IllegalArgumentException("Queen position must have positive row.");
        }
        if (column < -1) {
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
        if (row > 7) {
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        }
        if (column > 7) {
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public List<List> getDiagonals() {
        var list = new ArrayList<List>();

        int xUp = row;
        int yUp = column;

        int xDown = row;
        int yDown = column;

        int xLeft = row;
        int yLeft = column;

        int xRight = row;
        int yRight = column;

        for (int i = 0; i < 8; i++) {
            if (xUp < 8 && yUp < 8)         list.add(List.of(++xUp, ++yUp));
            if (xDown > 0 && yDown > 0)     list.add(List.of(--xDown, --yDown));
            if (xLeft > 0 && yLeft < 8)     list.add(List.of(--xLeft, ++yLeft));
            if (xRight < 8 && yRight > 0)   list.add(List.of(++xRight, --yRight));
        }
        return list;
    }
}
*/
