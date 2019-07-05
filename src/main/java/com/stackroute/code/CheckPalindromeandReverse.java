//1. Write a Java method to Reverse the given input & Check if it is a Palindrome.

package com.stackroute.code;

public class CheckPalindromeandReverse {

    String reversed = "";

    public void validatePalindromeandReverse(String input)
    {

        //String temp="";//input;
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }

        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversed = reversed + input.charAt(i);
        }
    }
        public String checkPalindrome(String input)
        {

            /**String isPalindrome = ;
            String notPalindrome = ;*/

            if(reversed == input)
            {
                return "Entered input is a palindrome";

            }
            else
            {
                return "Entered input is not a palindrome";
            }

        }
}
