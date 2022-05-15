package at.campus02.bsd;

public class Calculator
{
    public double add(double number1, double number2)
    {
        double result=0;
        result=number1+number2;
        return result;
    }
    public double minus(double number1, double number2)
    {
        double result=0;
        result=number1-number2;
        return result;
    }
    public double multiply(double number1, double number2)
    {
        double result=0;
        result=number1*number2;
        return result;
    }
    public double divide(double number1, double number2)
    {
        double result=0;
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
        return  result;
    }

}
