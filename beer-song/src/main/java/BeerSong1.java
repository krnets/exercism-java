/*
import java.util.ArrayList;

public class BeerSong {
    public String sing(int startVerse, int numberOfVerses) {
        var list = new ArrayList<String>();

        while (numberOfVerses > 0) {
            String x;
            if (startVerse == 0) {
                x = "No more bottles of beer on the wall, no more bottles of beer.";
            } else {
                x = String.format("%d bottle%s of beer on the wall, %d bottle%s of beer.", startVerse, isPlural(startVerse), startVerse, isPlural(startVerse));
            }
            list.add(x);

            --startVerse;
            --numberOfVerses;

            String y;
            if (startVerse < 0) {
                y = "Go to the store and buy some more, 99 bottles of beer on the wall.";
            } else if (startVerse == 0) {
                y = "Take it down and pass it around, no more bottles of beer on the wall.";
            } else {
                y = String.format("Take one down and pass it around, %d bottle%s of beer on the wall.", startVerse, isPlural(startVerse));
            }
            list.add(y + "\n");
        }
        return String.join("\n", list) + "\n";
    }

    private String isPlural(int bottles) {
        return bottles > 1 ? "s" : "";
    }

    public String singSong() {
        return sing(99, 100);
    }

}*/
