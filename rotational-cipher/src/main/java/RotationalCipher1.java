/*
class RotationalCipher {
    int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) ((chars[i] + shiftKey - 'A') % 26 + 'A');
            }
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) ((chars[i] + shiftKey - 'a') % 26 + 'a');
            }
        }
        return new String(chars);
    }

}
*/
