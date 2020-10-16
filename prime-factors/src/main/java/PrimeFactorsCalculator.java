import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {

    public List<Long> calculatePrimeFactorsOf(long l) {
        long currentPrime = 2L;
        long remainder = l;
        var primeFactors = new ArrayList<Long>();

        while (remainder != 1L) {
            if (remainder % currentPrime == 0) {
                primeFactors.add(currentPrime);
                remainder /= currentPrime;
            } else {
                currentPrime = BigInteger.valueOf(currentPrime).nextProbablePrime().longValue();
            }
        }
        return primeFactors;
    }
}
