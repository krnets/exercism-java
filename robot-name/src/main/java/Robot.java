import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class Robot {

    private String name;
    private final HashSet<String> set = new HashSet<>();
    private final Random r = new Random();

    public Robot() {
        name = generateName();
        set.add(name);
    }

    public String getName() {
        return name;
    }

    private String generateName() {
        var letters = r.ints()
                .limit(2)
                .mapToObj(i -> 'A' + r.nextInt(26))
                .map(Character::toString)
                .collect(Collectors.joining());

        var numbers = r.ints()
                .limit(3)
                .mapToObj(i -> r.nextInt(10))
                .map(String::valueOf)
                .collect(Collectors.joining());

        return String.format("%s%s", letters, numbers);
    }

    public void reset() {
        name = generateName();

        while (set.contains(name)) {
            name = generateName();
            set.add(name);
        }
    }

}
