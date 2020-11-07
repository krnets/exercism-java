public class QueenAttackCalculator {
    private final Queen whiteQueen;
    private final Queen blackQueen;

    public QueenAttackCalculator(Queen white, Queen black) {
        if (white == null || black == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }
        if (sameRow(white, black) && sameColumn(white, black)) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
        this.whiteQueen = white;
        this.blackQueen = black;
    }

    public boolean canQueensAttackOneAnother() {
        return sameRow(whiteQueen, blackQueen)
                || sameColumn(whiteQueen, blackQueen)
                || sameDiagonal(whiteQueen, blackQueen);
    }

    private boolean sameRow(Queen white, Queen black) {
        return white.getRow() == black.getRow();
    }

    private boolean sameColumn(Queen white, Queen black) {
        return white.getColumn() == black.getColumn();
    }

    private boolean sameDiagonal(Queen white, Queen black) {
        return Math.abs(white.getRow() - black.getRow()) == Math.abs(white.getColumn() - black.getColumn());
    }
}
