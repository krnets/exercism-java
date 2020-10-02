class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = input * (input + 1) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int n = input;
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
