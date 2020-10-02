class NaturalNumber {

    private final int number;

    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        int sum = aliquotSum(number);

        return (sum < number) ? Classification.DEFICIENT :
                (sum > number) ? Classification.ABUNDANT :
                        Classification.PERFECT;
    }

    private int aliquotSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum;
    }

}
