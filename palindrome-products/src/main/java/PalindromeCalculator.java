import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class PalindromeCalculator {

    public SortedMap<Long, List<List<Integer>>> getPalindromeProductsWithFactors(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("invalid input: min must be <= max");
        }
        var palindromeFactors = new TreeMap<Long, List<List<Integer>>>();

        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                long product = i * j;
                if (isPalindrome(product)) {
                    var factorsList = palindromeFactors.get(product);
                    if (factorsList == null) {
                        factorsList = new ArrayList<>();
                    }
                    factorsList.add(List.of(i, j));
                    palindromeFactors.put(product, factorsList);
                }
            }
        }
        return palindromeFactors;
    }

    private boolean isPalindrome(Long number) {
        long reversed = 0;
        long n = number;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed == number;
    }

}