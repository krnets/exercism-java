/*
import java.util.List;

public class Knapsack {

    int maximumValue(int capacity, List<Item> items) {
        int[] weights = new int[items.size()];
        int[] values = new int[items.size()];

        int[][] cache = new int[weights.length + 1][capacity + 1];

        for (int i = 0; i < items.size(); i++) {
            var item = items.get(i);
            weights[i] = item.getWeight();
            values[i] = item.getValue();
        }

        for (int i = 1; i <= weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    cache[i][j] = cache[i - 1][j];
                } else {
                    cache[i][j] = Math.max(
                            cache[i - 1][j],
                            cache[i - 1][j - weights[i - 1]] + values[i - 1]
                    );
                }
            }
        }
        return cache[weights.length][capacity];
    }
}

*/
