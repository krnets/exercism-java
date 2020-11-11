/*
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
        int randomKeyLength = 100;
        Random r = new Random();

        return IntStream.range(0, randomKeyLength)
                .map(i -> 'a' + r.nextInt(ALPHABET_LENGTH))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }

    public Cipher(String key) {
        cipherText = key;
    }

    public String getKey() {
        return cipherText;
    }

    public String encode(String plainText) {
        var sb = new StringBuilder();

        increaseCipherTextLength(plainText);

        for (int i = 0; i < plainText.length(); i++) {
            int offset = cipherText.charAt(i) - 'a';
            char c = abc.charAt(abc.indexOf(plainText.charAt(i)) + offset);
            sb.append(c);
        }
        return sb.toString();
    }

    public String decode(String plainText) {
        var sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int offset = cipherText.charAt(i) - 'a';
            char c = abc.charAt(abc.lastIndexOf(plainText.charAt(i)) - offset);
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
*/
