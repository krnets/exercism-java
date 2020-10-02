public class Hamming {
    char[] leftStrand;
    char[] rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        validateInput(leftStrand, rightStrand);

        this.leftStrand = leftStrand.toCharArray();
        this.rightStrand = rightStrand.toCharArray();
    }

    private void validateInput(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");

        if (!leftStrand.isEmpty() && rightStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");

        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance() {
        int count = 0;

        for (int i = 0; i < leftStrand.length; i++) {
            if (leftStrand[i] != rightStrand[i])
                count++;
        }
        return count;
    }
}
