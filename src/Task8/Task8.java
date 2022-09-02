package Task8;

public class Task8 {
    public static void display(CustomDouble number1, CustomDouble number2){

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println(number1 + " + " + number2 + " = " + number1.add(number2));
        System.out.println(number1 + " - " + number2 + " = " + number1.sub(number2));
        System.out.println(number1.compare(number2));
    }
    public static void main(String[] args) {
        try {
            final CustomDouble number1 = new CustomDouble(12.5);
            final CustomDouble number2 = new CustomDouble(8, 0);

            display(number1, number2);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
