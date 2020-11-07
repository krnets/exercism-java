/*
import java.util.List;

public class Knapsack {

    int maximumValue(int capacity, List<Item> items) {
        int[] prevBestCostAtWeight = new int[capacity + 1];

        for (Item item : items) {
            int[] bestCostAtWeight = new int[capacity + 1];

            for (int i = 0; i <= capacity; i++) {
                if (i < item.getWeight()) {
                    bestCostAtWeight[i] = prevBestCostAtWeight[i];
                } else {
                    bestCostAtWeight[i] = Math.max(
                            prevBestCostAtWeight[i],
                            item.getValue() + prevBestCostAtWeight[i - item.getWeight()]
                    );
                }
            }
            prevBestCostAtWeight = bestCostAtWeight;
        }
        return prevBestCostAtWeight[capacity];
    }
}
*/

