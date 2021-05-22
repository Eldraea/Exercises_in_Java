/*
SpeedConverter.java
-------------------------------------------------------------------------------------------------
Created by Eldr@e@
-------------------------------------------------------------------------------------------------
Challenge: 1.Write a method called toMilesPerHour that has 1 parameter of type double
            with the name kilometersPerHour. This methods needs to return the rounded
            value of the calculation of type long.
            If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
            needs to return -1 to indicate an invalid value.
            Otherwise, if it is positive, calculate the value of miles per hour, round it
            and return it.
           2.Write another method called printConversion with 1 parameter of type double with
             the name kilometersPerHour.
             This methods should not return anything(void) and it needs to calculate milesPerHour
             from kilometersPerHour parameter.
             Then it needs to print a message in the format "XX km/h = YY mi/h".
                XX represents the original value kilometersPerHour
                YY represents the rounded milesPerHour from the kilometersPerHour parameter.
             If the parameter kilometersPerHour is <0 then print the text "Invalid Value".
---------------------------------------------------------------------------------------------------
Created on : 22/05/2021
---------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
----------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour)
    {
        long result;
        if(kilometersPerHour < 0)
            result = -1;
        else
            result = Math.round(kilometersPerHour / 1.609);

        return result;

    }
    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour +" km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
