/*
NumberPalindrome.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method called isPalindrome with one int parameter called number.
               The methods needs to return a boolean. It should return true if the number is a palindrome number
               otherwise it should return false.

------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number)
    {
        int reverse = 0 ;
        int lastDigit;
        int oldNumber = number;
        boolean isPalindromeOrNot = false;
        do {
            lastDigit = number %10;
            reverse = reverse *10;
            reverse = reverse + lastDigit;
            number = number/10;

        }while(number != 0);

        if(reverse == oldNumber)
            isPalindromeOrNot= true;

        return isPalindromeOrNot;

    }


}
