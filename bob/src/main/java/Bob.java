public class Bob {
    public String hey(String input) {
        input = input.trim();

        if (isShouting(input)) {
            if (isAskingQuestion(input)) {
                return "Calm down, I know what I'm doing!";
            }
            if (hasLetter(input)) {
                return "Whoa, chill out!";
            }
        }
        if (isAskingQuestion(input)) {
            return "Sure.";
        }
        if (isGibberishOrEmpty(input)) {
            return "Fine. Be that way!";
        }
        return "Whatever.";
    }

    private boolean isGibberishOrEmpty(String s) {
        return s.chars().filter(Character::isLetterOrDigit).count() == 0;
    }

    private boolean isAskingQuestion(String s) {
        return s.endsWith("?");
    }

    private boolean isShouting(String s) {
        return hasLetter(s) && s.equals(s.toUpperCase());
    }

    private boolean hasLetter(String s) {
        return s.chars().anyMatch(Character::isLetter);
    }
}