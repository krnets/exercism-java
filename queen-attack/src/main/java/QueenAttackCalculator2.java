/*
public class QueenAttackCalculator {
    private final Queen white;
    private final Queen black;

    public QueenAttackCalculator(Queen white, Queen black) {
        if (white == null || black == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }
        if (white.getRow() == black.getRow() && white.getColumn() == black.getColumn()) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
        this.white = white;
        this.black = black;
    }

    public boolean canQueensAttackOneAnother() {
        return white.getRow() == black.getRow() || white.getColumn() == black.getColumn() ||
                Math.abs(white.getRow() - black.getRow()) == Math.abs(white.getColumn() - black.getColumn());
    }
}
*/
