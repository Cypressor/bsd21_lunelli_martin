package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2)
    {
        double result=0;
        result=number1+number2;

        logger.debug("Calculator.add has been called with %f,%f",number1,number2);

        return result;
    }
    public double minus(double number1, double number2)
    {
        double result=0;
        result=number1-number2;

        logger.debug("Calculator.minus has been called with %f,%f",number1,number2);

        return result;
    }
    public double multiply(double number1, double number2)
    {
        double result=0;
        result=number1*number2;

        logger.debug("Calculator.multiply has been called with %f,%f",number1,number2);

        return result;
    }
    public double divide(double number1, double number2)
    {
        double result=0;

        logger.debug("Calculator.divide has been called with %f,%f", number1, number2);

        if(number2==0)
        {
            logger.error("ERROR - Division by zero exception!");
            throw new ArithmeticException();
        }
            result=number1/number2;


        return result;
    }

    public int faculty(int number)
    {
        int result= 0;
        if(number>0)
        {
            result=1;
            for(int i = 1;i<=number;i++)
            {
                result=result*i;
            }
        }
        else if(number==0)
        {
            result=1;
        }
        else
        {
        }

        logger.debug("Calculator.divide has been called with %d",number);

        return  result;
    }

}
