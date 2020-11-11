import java.util.ArrayList;

public class BaseConverter {

    private int numberInBase10 = 0;

    public BaseConverter(int currentBase, int[] digits) {
        if (currentBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        converToBase10(currentBase, digits);
    }

    private void converToBase10(int base, int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 0) {
                throw new IllegalArgumentException("Digits may not be negative.");
            }
            if (digits[i] >= base) {
                throw new IllegalArgumentException("All digits must be strictly less than the base.");
            }
            numberInBase10 += (digits[i] * Math.pow(base, digits.length - i - 1));
        }
    }

    public int[] convertToBase(int targetBase) {
        if (targetBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        if (numberInBase10 == 0) {
            return new int[]{0};
        }
        var list = new ArrayList<Integer>();

        while (numberInBase10 > 0) {
            list.add(0, numberInBase10 % targetBase);
            numberInBase10 /= targetBase;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
