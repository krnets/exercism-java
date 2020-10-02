class ReverseString {

    String reverse(String inputString) {
        if (inputString.length() > 1) {
            return reverse(inputString.substring(1)).concat(inputString.substring(0, 1));
        }
        return inputString;
    }

}
