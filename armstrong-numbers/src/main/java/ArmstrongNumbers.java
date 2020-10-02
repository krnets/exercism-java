class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int n = numberToCheck;
        int sum = 0;
        int length = (int) (Math.log10(numberToCheck) + 1);

        while (n > 0) {
            sum += Math.pow(n % 10, length);
            n /= 10;
        }
        return sum == numberToCheck;
    }

}
