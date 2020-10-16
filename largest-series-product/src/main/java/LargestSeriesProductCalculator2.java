/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

class LargestSeriesProductCalculator {

    private final int[] digits;

    LargestSeriesProductCalculator(String inputNumber) {
        if (Pattern.compile("\\D").matcher(inputNumber).find())
            throw new IllegalArgumentException("String to search may only contain digits.");

        this.digits = inputNumber.chars().map(Character::getNumericValue).toArray();
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits == 0) return 1;
        if (numberOfDigits > digits.length)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        var list = new ArrayList<Long>();

        for (int i = 0; i <= digits.length - numberOfDigits; i++) {
            long product = Arrays.stream(digits, i, i + numberOfDigits).reduce(1, (a, b) -> a * b);
            list.add(product);
        }
        return list.stream().max(Comparator.comparingLong(Long::longValue)).orElse(0L);
    }
}*/
