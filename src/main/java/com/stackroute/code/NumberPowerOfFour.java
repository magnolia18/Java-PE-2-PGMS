//2. Write a Java method to check if a given number is power of 4
package com.stackroute.code;

public class NumberPowerOfFour {

    public static boolean checkNumber(int num) {

        if(num<=0)
        {
            return false;
        }

        while(num > 1)
        {
            if(num % 4 != 0)
            {
                return false;
            }
            num = num / 4;
        }
        return true;
    }
}
