/*
EqualSumChecker.java
-----------------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------------
Challenge: Write a method hasEqualSum with 3 parameters of type int. The method should return
           boolean and it needs to return true if the sum of the first and second parameter is
           equal to the third parameter.Otherwise, return false.
------------------------------------------------------------------------------------------------
Created on: 22/05/2021
------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class EqualSumChecker {

    public static boolean hasEqualSum(int number1, int number2, int number3)
    {
        return (number1 + number2 == number3);
    }
}
