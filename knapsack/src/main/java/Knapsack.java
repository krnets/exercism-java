import java.util.List;

public class Knapsack {

    int maximumValue(int capacity, List<Item> items) {
        int[][] dp = new int[items.size() + 1][capacity + 1];

        for (int i = 1; i <= items.size(); i++) {
            var weight = items.get(i - 1).getWeight();
            var value = items.get(i - 1).getValue();

            for (int j = 1; j <= capacity; j++) {
                if (weight > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                }
            }
        }
        return dp[items.size()][capacity];
    }
}
