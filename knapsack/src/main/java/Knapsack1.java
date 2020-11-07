/*
import java.util.List;

public class Knapsack {

    public int maximumValue(int weightLimit, List<Item> items) {
        int[] weights = new int[items.size()];
        int[] values = new int[items.size()];

        for (int i = 0; i < items.size(); i++) {
            var item = items.get(i);
            weights[i] = item.getWeight();
            values[i] = item.getValue();
        }
        return knapsack(weightLimit, weights, values, 0);
    }

    private int knapsack(int W, int[] weights, int[] values, int i) {
        if (i == weights.length) return 0;
        if (W - weights[i] < 0)
            return knapsack(W, weights, values, i + 1);

        return Math.max(
                knapsack(W - weights[i], weights, values, i + 1) + values[i],
                knapsack(W, weights, values, i + 1)
        );
    }
}*/
