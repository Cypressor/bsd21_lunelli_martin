package at.campus02.bsd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{

    @BeforeEach
    void setUp()
    {

    }

    @Test
    void addTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(30,calculator.add(20,10),"20+10 must be 30");
    }

    @Test
    void addTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1+number2,calculator.add(number1,number2),"20+10 must be 30");
    }

    @Test
    void minusTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.minus(20,10),"20-10 must be 10");
    }

    @Test
    void minusTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1-number2,calculator.minus(number1,number2),"20-10 must be 10");
    }

    @Test
    void multiplyTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(200,calculator.multiply(20,10),"20*10 must be 200");
    }

    @Test
    void multiplyTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1*number2,calculator.multiply(number1,number2),"20*10 must be 200");
    }

    @Test
    void divideTest1()
    {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(20,10),"20/10 must be 2");
    }

    @Test
    void divideTest2()
    {
        Calculator calculator = new Calculator();
        double number1=20;
        double number2=10;
        assertEquals(number1/number2,calculator.divide(number1,number2),"20/10 must be 2");
    }
}