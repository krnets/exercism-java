class RotationalCipher {
    int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] array = data.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                char base = Character.isUpperCase(array[i]) ? 'A' : 'a';

                array[i] = (char) ((array[i] + shiftKey - base) % 26 + base);
            }
        }
        return new String(array);
    }

}
