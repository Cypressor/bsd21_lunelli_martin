import at.campus02.bsd.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * This is the main class of the application
 * It does nothing but throw an error message, because I was told it should do so in an earlier exercise
 * @author Martin Lunelli
*/

public class Main
{
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args)
    {
       /* Calculator calculator = new Calculator();
        System.out.printf("%f\n",calculator.add(1,2));
        System.out.printf("%f\n",calculator.minus(1,2));
        System.out.printf("%f\n",calculator.multiply(1,2));
        System.out.printf("%f\n",calculator.divide(1,2));
        System.out.printf("%d\n",calculator.faculty(1));
*/

        /**
         * Log an error, because it is very usefu to do so.
        */

        logger.info("INFO");
        logger.error("ERROR");


    }
}
