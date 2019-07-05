//7. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
//        signed integer). Your
package com.stackroute.code;

public class CalculateFactorial {

    public int calculateFactorial(int number)
    {
        int fact=1;
        if(number<=12)
        {
            for (int i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
        }
        return fact;

    }
    public long calculateFactorialOfNumber(int number)
    {
        int fact=1;
        if(number<=20)
        {
            for (int i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
        }
        return fact;

    }
}
