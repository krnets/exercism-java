/*
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

class CollatzCalculator {

    IntUnaryOperator nextCollatz = n -> n % 2 == 0 ? n / 2 : 3 * n + 1;

    int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only natural numbers are allowed");


        return (int) IntStream.iterate(start, i -> i != 1, nextCollatz).count();
    }

}
*/
