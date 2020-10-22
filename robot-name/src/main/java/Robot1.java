/*
import java.util.HashSet;

public class Robot {

    HashSet<String> set = new HashSet<>();

    public String getName() {
        String name = generateName();

        while (set.contains(name)) {
            name = generateName();
            set.add(name);
        }
        return name;
    }

    private String generateName() {
        return String
                .format("%s%s%d%d%d", getRandomChar(), getRandomChar(), getRandomInt(10), getRandomInt(10), getRandomInt(10));
    }

    private int getRandomInt(int i) {
        return (int) (Math.random() * i);
    }

    private String getRandomChar() {
        return Character.toString('A' + getRandomInt(100) % 26);
    }

    public void reset() {
    }

}*/
