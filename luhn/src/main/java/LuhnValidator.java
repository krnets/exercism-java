class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");
        int sum = 0;
        boolean oddLength = candidate.length() % 2 == 1;

        if (!candidate.matches("^\\d{2,}$")) {
            return false;
        }
        for (int i = 0; i < candidate.length(); i++) {
            int n = candidate.charAt(i) - '0';

            if ((oddLength && i % 2 == 0) || (!oddLength && i % 2 == 1)) {
                sum += n;
            }
            if ((oddLength && i % 2 == 1) || (!oddLength && i % 2 == 0)) {
                n *= 2;
                sum += n - (n > 9 ? 9 : 0);
            }
        }
        return sum % 10 == 0;
    }

}
