package Task9;

import Task8.CustomDouble;

public class Calculator {
    public static int sum(final int num1, final int num2) {
        return num1 + num2;
    }

    public static int sub(final int num1, final int num2) {
        return num1 - num2;
    }

    public static double sum(final double num1, final double num2) {
        return num1 + num2;
    }

    public static double sub(final double num1, final double num2) {
        return num1 - num2;
    }

    public static int mult(final int num1, final int num2) {
        return num1 * num2;
    }

    public static double div(final int num1, final int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("division by 0!");
        } else {
            return num1 / num2;
        }
    }

    public static CustomDouble mult(final double num1, final double num2) {
        return new CustomDouble(num1 * num2);
    }

    public static CustomDouble div(final double num1, final double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("division by 0!");
        }
        return new CustomDouble(num1 / num2);
    }

    public static void operations(final int num1, final char operator, final int num2) {
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + Calculator.sub(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + Calculator.mult(num1, num2));
                break;
            case '/':
                try {
                    System.out.println(num1 + " / " + num2 + " = " + Calculator.div(num1, num2));
                } catch (final Exception e) {
                    e.printStackTrace();
                }
            break;
            default:
                System.out.println("Wrong operator");
        }
    }

    public static void operations(final double num1, final char operator, final double num2) {
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + Calculator.sub(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + Calculator.mult(num1, num2).toDouble());
                break;
            case '/':
                try {
                    System.out.println(num1 + " / " + num2 + " = " + Calculator.div(num1, num2).toDouble());
                } catch (final Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
