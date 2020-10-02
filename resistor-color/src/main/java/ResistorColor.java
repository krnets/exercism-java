import java.util.List;

class ResistorColor {
    String[] RING_COLORS = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return List.of(RING_COLORS).indexOf(color);
    }

    String[] colors() {
        return RING_COLORS;
    }
}
