package com.stackroute.code;


public class PowerOfFour {
    public static class Logarithm
    {
        public static double logb( double a, double b )
        {
            return Math.log(a) / Math.log(b);
        }

        public static double log2( double a )
        {
            return logb(a,2);
        }

        public static void main( String[] args )
        {
            System.out.println(log2(100));
        }
    }

}
