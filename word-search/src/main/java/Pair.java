class Pair {

    private final int x;

    private final int y;

    Pair(final int x, final int y) {
        this.y = y;
        this.x = x;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public Pair plus(Pair other) {
        return new Pair(x + other.x, y + other.y);
    }

    public Pair times(int n) {
        return new Pair(x * n, y * n);
    }

    public boolean within(Pair max) {
        return (x > 0 && x <= max.x) &&
                (y > 0 && y <= max.y);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair pair = (Pair) o;

        return x == pair.x && y == pair.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

}

