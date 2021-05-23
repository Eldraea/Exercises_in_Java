/*
NumberOfDaysInMonth.java
------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method isLeapYear with a parameter of type int named year.
            The parameter needs to be greater then or equal to 1 and less than or equal to 9999.
            If the parameter is not in that range return false.
            Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if
            it is.
            A year is a leap ear if it is divisible by 4 but not by 100, or it is divisible by 400.
           2. Write another method getDaysInMonth with two parameters month and year. Both of type int.
             If parameter month is <1 or > 12 return -1.
             If parameter year is <1 or > 9999 then return -1.
             This method needs to return the number of days in the month. Be careful about leap years they
             have 29 days in month 2 (February)
             You should check if the year is a leap year using the method isLeapYear described above.
-------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
-------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
-------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class NumberOfDaysInMonth {


    public static boolean isLeapYear(int year)
    {
        boolean isLeap = false;
       if(year>1 && year <9999) {
           if (year % 4 == 0) {
               if (year % 100 == 0) {
                   if (year % 400 == 0) {
                       isLeap = true;
                   }
               }else {
                   isLeap = true;
               }
           }
       }

        return isLeap;
    }

    public static int getDaysInMonth( int month, int year)
    {
        if(month<1 || month >12 || year <1 || year >9999)
            return -1;
       else if((month%2 == 1 && month <8) || (month%2 == 0 && month >=8))
           return 31;
       else if((month%2 == 0 && month <8 && month !=2) ||(month%2 ==1 && month > 8))
           return 30;
       else if( isLeapYear(year) && month == 2)
           return 29;
       else
           return 28;

    }


}
