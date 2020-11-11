import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cipher {

    private final int ALPHABET_LENGTH = 26;
    private String cipherText;

    private final String abc = IntStream.range(0, ALPHABET_LENGTH * 2)
            .map(i -> 'a' + i % ALPHABET_LENGTH)
            .mapToObj(Character::toString)
            .collect(Collectors.joining());

    public Cipher() {
        cipherText = generateRandomKey();
    }

    private String generateRandomKey() {
        Random r = new Random(System.currentTimeMillis());
        int randomKeyLength = 100;

        return IntStream.range(0, randomKeyLength)
                .map(i -> 'a' + r.nextInt(ALPHABET_LENGTH))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }

    public Cipher(String key) {
        if (key.matches("[^a-z]+")) {
            throw new IllegalArgumentException("Lowercase letters only");
        }
        cipherText = key;
    }

    public String getKey() {
        return cipherText;
    }

    public String encode(String plainText) {
        increaseCipherTextLength(plainText);

        return shiftChars(plainText, true);
    }

    public String decode(String plainText) {
        return shiftChars(plainText, false);
    }

    private String shiftChars(String plainText, boolean shiftRight) {
        var sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int offset = cipherText.charAt(i) - 'a';
            char c;
            char p = plainText.charAt(i);

            if (shiftRight) {
                c = abc.charAt(abc.indexOf(p) + offset);
            } else {
                c = abc.charAt(abc.lastIndexOf(p) - offset);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private void increaseCipherTextLength(String plainText) {
        while (cipherText.length() < plainText.length()) {
            cipherText += cipherText;
        }
    }
}
