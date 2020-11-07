/*
import java.util.List;

public class Knapsack {

    int maximumValue(int capacity, List<Item> items) {

        return items.stream()
                .mapToInt(item -> item.getWeight() > capacity ? 0 :
                        item.getValue() + maximumValue(
                                capacity - item.getWeight(),
                                items.subList(items.indexOf(item) + 1, items.size())
                        ))
                .max().orElse(0);
    }
}
*/

