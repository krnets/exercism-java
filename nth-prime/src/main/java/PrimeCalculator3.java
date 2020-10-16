/*
import java.math.BigInteger;
import java.util.ArrayList;

class PrimeCalculator {

    static ArrayList<Integer> primes = new ArrayList<>();

    static {
        primes.add(2);
    }

    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException();
        }
        while (primes.size() < nth) {
            int nextPrime = BigInteger.valueOf(primes.get(primes.size() - 1))
                    .nextProbablePrime()
                    .intValue();
            primes.add(nextPrime);
        }
        return primes.get(nth - 1);
    }

}*/
