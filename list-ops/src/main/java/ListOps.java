import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class ListOps {

    static <T> List<T> append(List<T> list1, List<T> list2) {
        var result = new ArrayList<T>(list1);
        result.addAll(list2);

        return result;
    }

    static <T> List<T> concat(List<List<T>> listOfLists) {
        var result = new ArrayList<T>();

        for (List<T> list : listOfLists)
            result.addAll(list);

        return result;
    }

    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        var result = new ArrayList<T>();

        for (T item : list)
            if (predicate.test(item))
                result.add(item);

        return result;
    }

    static <T> int size(List<T> list) {
        return list.size();
    }

    static <T, U> List<U> map(List<T> list, Function<T, U> transform) {
        var result = new ArrayList<U>();

        for (T item : list)
            result.add(transform.apply(item));

        return result;
    }

    static <T> List<T> reverse(List<T> list) {
        var result = new LinkedList<T>();

        for (T item : list)
            result.push(item);

        return result;
    }

    static <T, U> U foldLeft(List<T> list, U initial, BiFunction<U, T, U> f) {
        U accumulate = initial;

        for (T item : list)
            accumulate = f.apply(accumulate, item);

        return accumulate;
    }

    static <T, U> U foldRight(List<T> list, U initial, BiFunction<T, U, U> f) {
        U accumulate = initial;

        for (int i = list.size() - 1; i >= 0; i--) {
            T item = list.get(i);
            accumulate = f.apply(item, accumulate);
        }
        return accumulate;
    }

    private ListOps() {
        // No instances.
    }

}
