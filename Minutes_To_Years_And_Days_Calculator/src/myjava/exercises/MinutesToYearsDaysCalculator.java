/*
MinutesToYearsDaysCalculator.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Write a method printYearsAndDays with parameter of type long named minutes.
           The method should not return anything(void) and it needs to calculate the years and days from the minutes
           parameter.
           If the parameter is less than 0, print text "Invalid Value".
           Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"
                XX represents the original value minutes
                YY represents the calculated years
                ZZ represents th calculated days
------------------------------------------------------------------------------------------------------------------------
Create on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class MinutesToYearsDaysCalculator {


    public static void printYearsAndDays(long minutes)
    {
        if(minutes <0)
            System.out.println("Invalid Value");
        else
        {
            long numberOfYear = minutes/60/24/365;
            long numberOfDays = (minutes/60/24)%365;


            System.out.println(minutes + " min = " + numberOfYear + " y and " + numberOfDays + " d"  );

        }

    }
}
