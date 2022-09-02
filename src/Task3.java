public class Task3 {
    private static long loopFactorial(final int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    private static long recursionFactorial(final int num) {
        if (num == 0)
            return 1;
        else
            return (num * recursionFactorial(num - 1));
    }

    public static void main(final String[] args) {
        final int num = 5;
        System.out.println("Loop factorial of " + num + " = " + loopFactorial(num));
        System.out.println("Recursion factorial of " + num + " = " + recursionFactorial(num));
    }
}
