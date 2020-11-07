import java.util.ArrayList;

public class BeerSong {
    public String sing(int startVerse, int numberOfVerses) {
        var strings = new ArrayList<String>();

        while (numberOfVerses > 0) {
            String line1, line2, bottles, bottlesLeft;

            if (startVerse > 0) {
                bottles = String.format("%d bottle%s of beer", startVerse, isPlural(startVerse));
            } else {
                bottles = "No more bottles of beer";
            }
            line1 = String.format("%s on the wall, %s.", bottles, bottles.toLowerCase());

            --startVerse;
            --numberOfVerses;

            if (startVerse < 0) {
                bottlesLeft = "Go to the store and buy some more, 99 bottles";
            } else if (startVerse == 0) {
                bottlesLeft = "Take it down and pass it around, no more bottles";
            } else {
                bottlesLeft = String.format("Take one down and pass it around, %d bottle%s", startVerse, isPlural(startVerse));
            }
            line2 = String.format("%s of beer on the wall.\n", bottlesLeft);

            strings.add(line1);
            strings.add(line2);
        }
        return String.join("\n", strings) + "\n";
    }

    private String isPlural(int bottles) {
        return bottles > 1 ? "s" : "";
    }

    public String singSong() {
        return sing(99, 100);
    }

}
