class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replaceAll("\\W", "");

        return phrase.chars().distinct().count() == phrase.length();
    }

}
