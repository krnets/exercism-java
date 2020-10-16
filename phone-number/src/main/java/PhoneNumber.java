import java.util.regex.Pattern;

public class PhoneNumber {

    String phoneNumber;
    String areaCode;
    String localNumber;

    public PhoneNumber(String input) throws IllegalArgumentException {

        if (input.chars().anyMatch(Character::isLetter)) {
            throw new IllegalArgumentException("letters not permitted");
        }
        if (Pattern.compile("@:!").matcher(input).find()) {
            throw new IllegalArgumentException("punctuations not permitted");
        }

        phoneNumber = input.replaceAll("\\D", "");

        if (phoneNumber.length() > 11) {
            throw new IllegalArgumentException("more than 11 digits");
        }
        if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '1') {
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if (phoneNumber.charAt(0) == '1' && phoneNumber.length() == 11) {
            phoneNumber = phoneNumber.substring(1);
        }
        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("incorrect number of digits");
        }

        areaCode = phoneNumber.substring(0, 3);

        if (areaCode.charAt(0) == '0') {
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if (areaCode.charAt(0) == '1') {
            throw new IllegalArgumentException("area code cannot start with one");
        }

        localNumber = phoneNumber.substring(3);

        if (localNumber.charAt(0) == '0') {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if (localNumber.charAt(0) == '1') {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
    }

    public String getNumber() {
        return phoneNumber;
    }

}
