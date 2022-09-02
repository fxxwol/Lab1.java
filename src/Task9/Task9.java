package Task9;

import static Task9.Calculator.operations;

public class Task9 {

    public static void main(final String[] args) {
        final int num1 = 8;
        final int num2 = 2;
        final double num3 = 6.5;
        final double num4 = 20.6;

        operations(num1, '+', num2);
        operations(num1, '-', num2);
        operations(num1, '*', num2);
        operations(num1, '/', num2);

        operations(num3, '+', num4);
        operations(num3, '-', num4);
        operations(num3, '*', num4);
        operations(num3, '/', num4);
    }
}
