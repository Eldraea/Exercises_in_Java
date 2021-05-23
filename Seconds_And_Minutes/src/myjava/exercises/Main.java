/*
main.java
----------------------------------------------------------------------------------------------------------
Created by Eldr@e@
----------------------------------------------------------------------------------------------------------
Challenge: 1. Create a method called getDurationString with two parameters, first parameter minutes and
           second parameter seconds.
           You should validate that the first parameter minutes is >=0.
           You should validate that the second parameter seconds is >=0 and <=59
           The methods should return "Invalid value" in the method if either of the above are not true
           If the parameters are valid then calculate how many hours, minutes, and seconds equal the
           minutes and seconds passed to this method and return that value as string format "XXh YYm ZZs"
           where XX represents a number of hours, YY the minutes and ZZ the seconds.
           2. Create a second method of the same name but with only one parameter seconds.
             Validate that it is >=0 and return "Invalid value" if it is not true.
             If it is valid, then calculate how many minutes are in seconds value then call the other
             overloaded method passing the correct minutes and seconds calculated so that it can calculate
             correctly.
-----------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
-----------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    private static final String INVALID_VALUE_MESSAGE= "Invalid value";
    public static void main(String[] args) {

        System.out.println(getDurationString(39, 45));
        System.out.println(getDurationString(-1, 30));
        System.out.println(getDurationString(69, 10));
        System.out.println(getDurationString(90, 60));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString( int minutes, int seconds)
    {


        if(minutes <0 ||seconds <0 ||seconds>59)
            return  INVALID_VALUE_MESSAGE;

        String myDurationStringHour = minutes/60 + "h ";
        if(minutes/60 <10){
            myDurationStringHour = "0" +  myDurationStringHour;
        }
        String myDurationStringMinute = minutes%60 + "m ";

        if(minutes%60 <10)
        {
            myDurationStringMinute=   "0" +  myDurationStringMinute;
        }
        String myDurationStringSecond = seconds+ "s ";
        if(seconds <10)
        {
            myDurationStringSecond = "0"+ myDurationStringSecond;
        }

        return myDurationStringHour  +  myDurationStringMinute + myDurationStringSecond;
    }

    public static String getDurationString(int seconds)
    {
        if(seconds < 0)
            return INVALID_VALUE_MESSAGE;
        return getDurationString(seconds/60, seconds%60);
    }
}
