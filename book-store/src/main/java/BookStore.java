import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookStore {
    private static final double bookPrice = 8.0;

    public double calculateBasketCost(List<Integer> basket) {
        if (basket.isEmpty()) return 0;

        List<List<Integer>> bookGroups = new ArrayList<>();

        for (var book : basket) {
            var group = bookGroups.stream().filter(Predicate.not(list -> list.contains(book))).findFirst().orElse(null);

            if (group == null) {
                group = new ArrayList<>();
                bookGroups.add(group);
            }
            group.add(book);
        }
        int nGroups = bookGroups.size();
        int sizeFront = bookGroups.get(0).size();
        int sizeBack = bookGroups.get(nGroups - 1).size();
        double minimumCost = getPriceTotal(bookGroups);

        while ((sizeFront - sizeBack) > 1) {
            var front = bookGroups.get(0);
            var back = bookGroups.get(nGroups - 1);
            var unique = front.stream().filter(Predicate.not(back::contains)).findFirst().orElse(0);

            front.remove(unique);
            back.add(unique);
            bookGroups.sort((a, b) -> b.size() - a.size());

            minimumCost = Math.min(getPriceTotal(bookGroups), minimumCost);
            sizeFront = bookGroups.get(0).size();
            sizeBack = bookGroups.get(nGroups - 1).size();
        }
        return minimumCost;
    }

    private static double getPriceTotal(List<List<Integer>> booksGroup) {
        double priceTotal = 0;

        for (var books : booksGroup) {
            priceTotal += getDiscount(books.size());
        }
        return priceTotal;
    }

    private static double getDiscount(int books) {
        int discount = 0;

        switch (books) {
            case 2 -> discount = 5;
            case 3 -> discount = 10;
            case 4 -> discount = 20;
            case 5 -> discount = 25;
        }
        return (bookPrice * books) * (100 - discount) / 100;
    }
}
