import java.util.Arrays;
import java.util.Random;


class DnDCharacter {

    private final int strength = ability();
    private final int dexterity = ability();
    private final int constitution = ability();
    private final int intelligence = ability();
    private final int wisdom = ability();
    private final int charisma = ability();

    static int ability() {
        var rolls = new Random().ints(4, 1, 7).toArray();
        var min = Arrays.stream(rolls).min().getAsInt();
        return Arrays.stream(rolls).sum() - min;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

}