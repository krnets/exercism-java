import java.util.stream.IntStream;

class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException();
        }
        return IntStream.iterate(2, i -> i + 1)
                .filter(this::isPrime)
                .skip(nth - 1)
                .findFirst()
                .getAsInt();
    }

    private boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

}
