/**Write a program, which reads number of students and n grades as input (of int
        between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
        program shall check for valid input. You should keep all the grades in an int[] and use a
      method for each of the computations.*/
package com.stackroute.code;

public class StudentGrade {

    public int calculateGrades(int[] number) {

//        number.toString().split(",");
        int sum = 0;
        for (int i = 0; i <= 10; i++)
        {
            sum += number[i];
        }
        return sum;
    }

    public double average(int[] number,int sum)
    {
        double average=sum/number.length;
        return average;
    }
    public int maximum(int[] number)
    {
        int large=number[0];
        for(int i=0;i<=number.length;i++)
        {
            if(number[i]>large)
            {
                large=number[i];
            }

        }
        return large;
    }
    public int minimum(int[] number)
    {
        int small=number[0];
        for(int i=0;i<=number.length;i++)
        {
            if(number[i]<small)
            {
                small=number[i];
            }
        }
        return small;
    }
}
