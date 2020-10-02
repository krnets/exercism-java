/*
import java.util.stream.IntStream;

class NaturalNumber {

    private final int number;

    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        int aliquotSum = IntStream.rangeClosed(1, number / 2)
                .filter(x -> number % x == 0)
                .sum();

        return (aliquotSum < number) ? Classification.DEFICIENT :
                (aliquotSum > number) ? Classification.ABUNDANT :
                        Classification.PERFECT;
    }


}
*/
