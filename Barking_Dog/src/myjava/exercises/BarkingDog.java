/*
BarkingDog.java
-----------------------------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------------------------
Challenge: We have a dog that likes to bark. We need to wake up if the dog is barking at night!
           Write a method shouldWakeUp that has 2 parameters
                - 1st parameter should be of type boolean and be named "barking": it represents if our dog
                  is currently barking
                -2nd parameter represents the hour of the day and is of type int with the name hourOfDay
                  and has a valid range of 0-23
           We have to wake up if the dog is barking before 8 or after 22 hours so in that case, return true.
           In all other cases return false.
           If hourOfDay parameter is less than 0 or greater than 23, return false.
------------------------------------------------------------------------------------------------------------
Created on : 22/05/2021
------------------------------------------------------------------------------------------------------------
Last Update on: 22/05/2021
------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        boolean wakeUpFool = false;

        if((barking) && (hourOfDay ==23))
            wakeUpFool =  true;
        else if((barking ) && (hourOfDay<8) && (hourOfDay>=0))
            wakeUpFool = true;
        return wakeUpFool;

    }
}
