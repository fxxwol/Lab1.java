import java.util.Scanner;

public class Task2 {
    private static String deleteSymbol(final String str, final String symbol) {
        return str.replace(symbol, "");
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String str = sc.nextLine();
        System.out.print("Enter a symbol to delete: ");
        final String symbol = sc.nextLine();
        System.out.println("String after removing character: " + deleteSymbol(str, symbol));
    }
}
