/*
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

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

        return IntStream.rangeClosed(0, digits.length - numberOfDigits)
                .map(i -> Arrays.stream(digits, i, i + numberOfDigits).reduce(1, (a, b) -> a * b))
                .max().orElse(0);
    }
}*/
