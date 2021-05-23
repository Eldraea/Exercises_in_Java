/*
main.java
---------------------------------------------------------------------------------------------------------
Created by Eldr@e@
---------------------------------------------------------------------------------------------------------
Challenge:1. Create a method called calcFeetAndInchesToCentimeters. It needs to have two parameters.
             - feet is the first parameter
             - inches is the second parameter
           You should validate that the first parameter feet is >= 0. You should validate that the second
           parameter inches is >=0 and <= 12, return -1 from the method if either of the above is not true.
           If h=the parameters are valid, then calculate how many centimetres comprise the feet and inches
           passed to this method and return that value.
          2. Create a second method of the same name with only one parameter
              - inches is the parameter
           You should validate that this parameter is >=0. Return -1, if it is not true. But if it's valid,
           then calculate how many feet are in the inches and then here is the tricky part.
           Call the other overloaded method passing the correct feet and inches calculated so that it can
           calculate correctly.
           Hints: Use double for your number datatype is probably a good idea.
                   1 inch = 2.54cm and 1 foot= 12 inches
                   Calling another overloaded method just requires you to use the right number of parameters
-------------------------------------------------------------------------------------------------------------
Created on: 22/05/2021
-------------------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
-------------------------------------------------------------------------------------------------------------

 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {
        calculateScore("Tim", 500);
        System.out.println(calcFeetAndInchesToCentimeters(1,13 ));
        System.out.println(calcFeetAndInchesToCentimeters(157 ));

    }

    public static int calculateScore (String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored "+ score + " points ");
        return score*1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score* 1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(int feet, int inches)
    {
        double result;
        if( (feet < 0) || ((inches <0) || (inches>12)))
            result = -1d;
        else
            result = feet*12*2.54 + inches *2.54;
        return result;

    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {

        if(inches <0)
            return -1;

        return calcFeetAndInchesToCentimeters((int)inches /12, (int)inches%12);
    }
}
