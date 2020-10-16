import java.util.ArrayList;

class Proverb {

    private final String[] words;
    private final String genericPhrase = "For want of a %s the %s was lost.";
    private final String finalPhrase = "And all for the want of a %s.";

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        var list = new ArrayList<String>();

        for (int i = 0; i < words.length - 1; i++) {
            var s = String.format(genericPhrase, words[i], words[i + 1]);
            list.add(s);
        }
        if (words.length > 0) {
            var s = String.format(finalPhrase, words[0]);
            list.add(s);
        }
        return String.join("\n", list);
    }

}
