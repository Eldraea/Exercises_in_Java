/*
TeenNumberChecker.java
-------------------------------------------------------------------------------------------------------
Created by Eldr@e@
-------------------------------------------------------------------------------------------------------
Challenge: We'll say that a number is "teen" if it is in range 13-19(inclusive).
           1. Write a method named hasTeen with 3 parameters of type int.
             The method should return boolean and it needs to return true if one of the parameters is
             in range 13 (inclusive) - 19 (inclusive). Otherwise return false.
           2. Write another method named isTeen with 1 parameter of type int.
              The methods should return boolean and it needs to return true if the parameter is in
              range 13 (inclusive) - 19 (inclusive). Otherwise return false.
--------------------------------------------------------------------------------------------------------
Created on: 22/05/2021
--------------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
---------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class TeenNumberChecker {

    public static boolean hasTeen( int number1, int number2, int number3)
    {
        return ((number1 >=13 && number1<=19) || (number2 >=13 && number2<=19)||(number3 >=13 && number3 <= 19));
    }

    public static boolean isTeen (int number)
    {
        return ((number >=13 && number<=19));
    }
}
