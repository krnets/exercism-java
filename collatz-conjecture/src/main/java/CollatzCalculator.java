import java.util.Optional;

class CollatzCalculator {
    int computeStepCount(int start) {
        if (start <= 0) throw new IllegalArgumentException("Only natural numbers are allowed");

        return collatz(start).get();
    }

    Optional<Integer> collatz(int n) {
        if (n == 1) return Optional.of(0);
        if (n % 2 == 0) return collatz(n / 2).flatMap(x -> Optional.of(x + 1));

        return collatz(3 * n + 1).flatMap(x -> Optional.of(x + 1));
    }
}
