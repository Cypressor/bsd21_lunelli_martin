package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class is a simple calculator, that calculates stuff, because it is very useful to do so.#
 * @author Martin Lunelli
 */

public class Calculator
{
    private static Logger logger = LogManager.getLogger();

    /**
     * This method adds two numbers and returns the result.
     * @param number1 is one of two numbers to add together.
     * @param number2 is another one of two numbers to add together.
     * @return returns the result of two added numbers.
     */

    public double add(double number1, double number2)
    {
        double result=0;
        result=number1+number2;

        logger.debug("Calculator.add has been called with %f,%f",number1,number2);

        return result;
    }

    /**
     * subtracts a number from another and returns the result.
     * @param number1 is the number two subtract from.
     * @param number2 is the number to be subtracted.
     * @return returns the result of number two subtracted from number one.
     */

    public double minus(double number1, double number2)
    {
        double result=0;
        result=number1-number2;

        logger.debug("Calculator.minus has been called with %f,%f",number1,number2);

        return result;
    }

    /**
     * multiplies two numbers and returns the result.
     * @param number1 one of the two numbers two be multiplied.
     * @param number2 one of the two numbers to be multiplied.
     * @return returns the result of the multiplication.
     */

    public double multiply(double number1, double number2)
    {
        double result=0;
        result=number1*number2;

        logger.debug("Calculator.multiply has been called with %f,%f",number1,number2);

        return result;
    }

    /**
     * divides two numbers.
     * @param number1 number to be divided.
     * @param number2 number to be divided with.
     * @return the result of the division.
     */
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

    /**
     * builds the faculty of a number.
     * @param number number to build the faculty of.
     * @return returns the result of the faculty.
     */

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
