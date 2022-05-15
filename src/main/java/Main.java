import at.campus02.bsd.Calculator;

public class Main
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        System.out.printf("%f",calculator.add(1,2)+"\n");
        System.out.printf("%f",calculator.minus(1,2)+"\n");
        System.out.printf("%f",calculator.multiply(1,2)+"\n");
        System.out.printf("%f",calculator.divide(1,2)+"\n");
        System.out.printf("%f",calculator.faculty(1)+"\n");
    }
}
