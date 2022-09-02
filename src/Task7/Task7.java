package Task7;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void displayCheque(final List<Pair> listOfProducts){
        System.out.println("Cheque:");
        for (final Pair p: listOfProducts){
            System.out.println(p.getProduct().getName() +" "+ p.getAmount() + "  " + p.getProduct().getPrice() + "grn");
        }
        System.out.println("\nPrice: " + countTotalPrice(listOfProducts) +" grn");
    }
public static double countTotalPrice(final List<Pair> listOfProducts) {
    double totalPrice = 0;
    for (final Pair p : listOfProducts) {
        totalPrice += p.getProduct().getPrice() * p.getAmount();
    }
    return totalPrice;
}
    public static void main(final String[] args) {
        final List<Pair> listOfProducts = new ArrayList<>() {{
            add(new Pair(new Product("Apple", 10), 2));
            add(new Pair(new Product("Watermelon", 30), 1));
            add(new Pair(new Product("Grape", 15), 3));
        }};
        displayCheque(listOfProducts);
    }
}
