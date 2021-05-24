/*
LastDigitChecker.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method name hasSameLastDigit with three parameters of type int
              Each number should be within the range of 10 (inclusive) - 1000 (inclusive). I one of the numbers is not
              within the range, the method should return false.
              The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it
              should return false.
           2. Write another method named isValid with one parameter of type int.
              The method needs to return true if the number parameter is in range of 10 (inclusive) - 1000 (inclusive)
              otherwise return false.
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */
package myjava.exercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3)
    {
        boolean hasSameDigit= false;
        if(!isValid(number1) || !isValid(number2) || !isValid(number3))
            return false;
        for(int i = 0; i<10 ; i++)
        {

            if(number1%10== i && number2%10 ==i) {
                hasSameDigit = true;
                break;
            }
            else if( number1%10 ==i && number3%10==i) {
                hasSameDigit = true;
                break;
            }
            else if(number2%10==i && number3%10==i) {
                hasSameDigit = true;
                break;
            }
            else
                hasSameDigit = false;
        }
        return hasSameDigit;
    }

    public static boolean isValid(int number)
    {
        return (number>=10 && number<=1000);
    }
}
