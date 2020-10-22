import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class BracketChecker {
    private final List<String> list;
    private final Map<String, String> bracketPairs = Map.of("{", "}", "(", ")", "[", "]");

    public BracketChecker(String str) {
        list = str.chars()
                .mapToObj(Character::toString)
                .filter("(){}[]"::contains)
                .collect(Collectors.toList());
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        var stack = new Stack<String>();

        for (var c : list) {
            if (bracketPairs.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !c.equals(bracketPairs.get(stack.pop()))) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}