/*
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Robot {

    private String name;
    private final HashSet<String> set = new HashSet<>();

    public Robot() {
        name = generateName();
        set.add(name);
    }

    public String getName() {
        return name;
    }

    private String generateName() {
        var letters = IntStream.iterate(0, i -> i)
                .limit(2)
                .mapToObj(i -> getRandomChar())
                .collect(Collectors.joining());

        var numbers = IntStream.iterate(0, i -> i)
                .limit(3)
                .mapToObj(i -> getRandomInt())
                .map(String::valueOf)
                .collect(Collectors.joining());

        return String.format("%s%s", letters, numbers);
    }

    private int getRandomInt() {
        return (int) (Math.random() * 10);
    }

    private int getRandomInt(int i) {
        return (int) (Math.random() * i);
    }

    private String getRandomChar() {
        return Character.toString('A' + getRandomInt(100) % 26);
    }

    public void reset() {
        name = generateName();

        while (set.contains(name)) {
            name = generateName();
            set.add(name);
        }
    }

}*/
