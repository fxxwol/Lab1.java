import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"ambulance", "afternoon", "papaya", "banana", "addiction", "seven"};
        System.out.printf("Before sort:\n");
        print(strings);

        final char symbol = 'a';
        System.out.printf("\nAfter sort by " + symbol + ":\n");
        print(sort(strings, symbol));

        final char symbol1 = 'e';
        System.out.printf("\nAfter sort by " + symbol1 + ":\n");
        print(sort(strings, symbol1));
    }

    public static void print(String[] strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static int count(String word, char symbol) {
        int countOfSymbol = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == symbol) {
                countOfSymbol++;
            }
        }
        return countOfSymbol;
    }

    public static String[] sort(String[] strings, char symbol) {
        Comparator<String> comparator = Comparator.comparing(w -> count(w, symbol));
        Arrays.sort(strings, comparator.reversed());

        return strings;
    }
}

