/*
LeapYear.java
---------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
---------------------------------------------------------------------------------------------------------------
Challenge: Write a method isLeapYear with parameter of type int named year. The parameter needs to be greater
            than 0 and less or equal than 9999
           If the parameter is not in that range return false.
           Otherwise, if it is in the valid range, calculate if the year is leap year and return true if it is
           a leap year, otherwise return false.
           To determine whether a year is a leap year, follow these steps:
                1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5
                2.If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4
                3.If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5
                4. The year is a leap yea (it has 366days). The method isLeapYear needs to return true.
                5. The year is not a leap year (it has 365 days). The methods isLeapYear needs to return false.
---------------------------------------------------------------------------------------------------------------
Created on: 22/05/2021
--------------------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
---------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class LeapYear {

    public static boolean isLeapYear( int year)
    {
        boolean isLeap = false;
        if(year > 0 && year <=9999)
        {
            if(year %4 == 0){
                if(year %100 == 0)
                {
                    if(year% 400 ==  0)
                    {
                        isLeap= true;
                    }
                }
                else{
                    isLeap = true;
                }
            }
        }

        return isLeap;
    }
}
