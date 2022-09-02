package Task7;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void displayCheque(List<Pair> listOfProducts){
        System.out.println("Cheque:");
        double totalPrice = 0;
        for (Pair p: listOfProducts) {
            totalPrice+=p.getProduct().getPrice() * p.getAmount();
            System.out.println(p.getProduct().getName() +" "+ p.getAmount() + "  " + p.getProduct().getPrice() + "grn");
        }
        System.out.println("\nPrice: " + totalPrice +" grn");
    }

    public static void main(String[] args) {
        final List<Pair> listOfProducts = new ArrayList<>() {{
            add(new Pair(new Product("Apple", 10), 2));
            add(new Pair(new Product("Watermelon", 30), 1));
            add(new Pair(new Product("Grape", 15), 3));
        }};
        displayCheque(listOfProducts);
    }
}
