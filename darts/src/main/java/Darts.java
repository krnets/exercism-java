class Darts {
    private final double radius;

    Darts(double x, double y) {
        radius = x * x + y * y;
    }

    int score() {
        double distanceToCenter = Math.sqrt(radius);

        if (distanceToCenter <= 1)
            return 10;
        if (distanceToCenter <= 5)
            return 5;
        if (distanceToCenter <= 10)
            return 1;

        return 0;
    }

}
