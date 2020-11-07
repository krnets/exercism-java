class ReverseString {

    String reverse(String inputString) {
        char[] arr = inputString.toCharArray();
        char c;
        int halfLen = arr.length / 2;

        for (int i = 0; i < halfLen; i++) {
            c = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = c;
        }
        return new String(arr);
    }

}
