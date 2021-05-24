/*
PerfectNumber.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: What is a perfect number?
           A perfect number is a positive integer which is equal to the sum of its proper divisors.
           Proper positive divisors are positive integers that fully divide the perfect number without leaving a
           remainder and exclude the perfect number itself.
           For example, take the number 6:
           Its proper divisors are 1,2, and 3 ( since 6 is the value of the perfect number, it is excluded), and the sum
           of its proper divisors is 1 + 2 + 3 = 6.
           Therefore, 6 is a perfect number (as well as the first perfect number).

           1. Write a method named isPerfectNumber with one parameter of type int named number.
           If number is <1, the method should return false.
           The method must calculate, if the number is perfect. If the number is perfect, the method should return true,
           otherwise, it should return false.
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number)
    {
        if(number <1)
            return false;

        int sum = 0;
        for(int i = 1; i < number; i++)
        {
            if(number%i == 0)
                sum = sum + i;

        }
        if(sum == number)
            return true;
        else
            return false;
    }
}
