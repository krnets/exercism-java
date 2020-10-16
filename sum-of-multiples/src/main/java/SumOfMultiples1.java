/*
import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {

    private final int[] set;
    private final int number;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = Arrays.stream(set).filter(x -> x != 0).toArray();
    }

    int getSum() {
        return IntStream.range(1, number)
                .filter(x -> Arrays.stream(set).anyMatch(y -> x % y == 0))
                .sum();
    }

}
*/
