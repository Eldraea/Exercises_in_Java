/*
GreatestCommonDivisor.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
              If one of the parameter is <10, the method should return -1 to indicate an invalid value.
              The method should return the greatest common divisor of the two numbers (int).
              The greatest common divisor is the largest positive integer that can fully divide each of the integers
              (i.e. without leaving a remainder).
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */



package myjava.exercises;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second)
    {
        int limitToReach ;
        int greatestCommonDivisor =0;
        if(first < 10 || second < 10)
            return -1;

        limitToReach = Math.min(first, second);

        for(int i = 1; i <= limitToReach; i++)
        {
            if(first%i == 0 && second%i == 0)
                greatestCommonDivisor = i;
        }

        return greatestCommonDivisor;
    }
}
