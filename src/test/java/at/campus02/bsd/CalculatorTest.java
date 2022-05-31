package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is a JUnit test for the calculator class
 * @author Martin Lunelli
 */

class CalculatorTest
{
    @BeforeEach
    void setUp()
    {

    }

    //add-test 1

    @Test
    void addTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(30,calculator.add(20,10),"20+10 must be 30");
    }

    //add-test 2

    @Test
    void addTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1+number2,calculator.add(number1,number2),"20+10 must be 30");
    }

    //minus-test 1

    @Test
    void minusTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.minus(20,10),"20-10 must be 10");
    }

    //minus-test 2

    @Test
    void minusTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1-number2,calculator.minus(number1,number2),"20-10 must be 10");
    }

    //multiply-test1

    @Test
    void multiplyTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(200,calculator.multiply(20,10),"20*10 must be 200");
    }

    //multiply-test2

    @Test
    void multiplyTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1*number2,calculator.multiply(number1,number2),"20*10 must be 200");
    }

    //divide test 1

    @Test
    void divideTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(20,10),"20/10 must be 2");
    }

    //divide test 2

    @Test
    void divideTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1/number2,calculator.divide(number1,number2),"20/10 must be 2");
    }

    //divide test 3

    @Test
    void divideTest3()
    {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    //faculty-test 1

    @Test
    void facultyTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(1,calculator.faculty(0),"faculty of 0 must be 1");
    }

    //faculty-test 2

    @Test
    void facultyTest2()
    {
        Calculator calculator = new Calculator();
        assertEquals(3628800,calculator.faculty(10), "faculty of 1 must be 1");
    }

    //faculty-test 3

    @Test
    void facultyTest3()
    {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.faculty(-10), "faculty of 1 must be 1");
    }

}