import java.util.Scanner;

public class Task2 {
    private static String deleteSymbol(String str, String symbol) {
        return str.replace(symbol, "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a symbol to delete: ");
        String symbol = sc.nextLine();
        System.out.println("String after removing character: " + deleteSymbol(str, symbol));
    }
}
