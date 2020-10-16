class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        var chars = stringToVerify.replaceAll("[^0-9X]", "").toCharArray();
        if (chars.length != 10) return false;
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i == 9 && chars[i] == 'X')
                sum += 10;
            else
                sum += Character.getNumericValue(chars[i]) * (10 - i);
        }
        return sum % 11 == 0;
    }
}

