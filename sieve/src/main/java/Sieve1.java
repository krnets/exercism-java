/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sieve {
    private final int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        if (maxPrime < 2)
            return new ArrayList<>();

        var sieve = new boolean[maxPrime + 1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;

        for (int i = 2; i <= Math.sqrt(maxPrime); i++) {
            if (sieve[i])
                for (int j = 2 * i; j <= maxPrime; j += i) {
                    sieve[j] = false;
                }
        }

        var primes = new ArrayList<Integer>();

        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i])
                primes.add(i);
        }
        return primes;
    }
}
*/
