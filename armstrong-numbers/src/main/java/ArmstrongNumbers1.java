/*
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        var strNumber = String.valueOf(numberToCheck);
        int lenString = strNumber.length();

        int sum = strNumber.chars()
                .map(Character::getNumericValue)
                .map(x -> (int) Math.pow(x, lenString))
                .sum();

        return sum == numberToCheck;
    }

}
*/
