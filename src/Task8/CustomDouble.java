package Task8;

import java.util.Objects;

public class CustomDouble {
    private final int integer;
    private final double decimal;

    public CustomDouble(final double number){
        integer = (int)number;
        decimal = number - (int)number;
    }
    public CustomDouble (final int integer, final double decimal) throws Exception{
        this.integer = integer;
        if(decimal < 1){
            this.decimal = decimal;
        }
        else{
            throw new Exception("decimal should be less than 1");
        }
    }
    public CustomDouble add(final CustomDouble number) {
        final double sum = toDouble() + number.toDouble();
        return new CustomDouble(sum);
    }
    public CustomDouble sub(final CustomDouble number) {
        final double sub = toDouble() - number.toDouble();
        return new CustomDouble(sub);
    }
    public String compare(final CustomDouble number2){
        if(toDouble() == number2.toDouble()){
            return "number1 = number2";
        }
        if(integer > number2.integer){
            return "number1 > number2";
        }
        else {
            return "number1 < number2";
        }
    }
    public double toDouble(){
        return integer + decimal;
    }

    @Override
    public String toString() {
        return Double.toString(toDouble());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomDouble)) return false;
        final CustomDouble that = (CustomDouble) o;
        return integer == that.integer && Double.compare(that.decimal, decimal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, decimal);
    }
}
