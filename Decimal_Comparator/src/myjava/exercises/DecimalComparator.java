/*
DecimalComparator.java
-----------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------
Challenge: Write a method areEqualByTheeDecimalPlaces with two parameters of type double.
           The method should return boolean and it needs to return true if two double
           numbers are the same up to three decimal places. Otherwise, return false.
------------------------------------------------------------------------------------------
Created on : 22/05/2021
-------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
-------------------------------------------------------------------------------------------

 */

package myjava.exercises;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2)
    {
        boolean areEqual = false;

        if(number1< 0 && number2 <0){
            if( (double)(Math.ceil(number1*1000) /1000) ==  (double) Math.ceil(number2*1000) /1000)
            {
                areEqual = true;
            }
        }
        else if( number1>0 && number2> 0){
            if( (double)(Math.floor(number1*1000) /1000) ==  (double) Math.floor(number2*1000) /1000)
            {
                areEqual = true;
            }

        }
        else if (number1 == 0 && number2 == 0) {
            areEqual = true;
        }

        return areEqual;
    }
}
