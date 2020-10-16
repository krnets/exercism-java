import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Sieve {
    private final int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        if (maxPrime < 2) {
            return new ArrayList<>();
        }
        var sieve = new boolean[maxPrime + 1];
        Arrays.fill(sieve, 2, sieve.length, true);

        for (int i = 2; i <= Math.sqrt(maxPrime); i++) {
            for (int j = i * i; j <= maxPrime; j += i) {
                sieve[j] = false;
            }
        }
        return IntStream.range(0, sieve.length).filter(i -> sieve[i]).boxed().collect(Collectors.toList());
    }
}
