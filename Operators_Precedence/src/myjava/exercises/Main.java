/*
main.java
------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------
Challenge: 1.Create a double variable with a value of 20.00
           2.Create a second  variable of type double with the value 80.00
           3.Add both numbers together and multiply by 100.00.
           4.Use the remainder operator to figure out what the remainder from the result operation in step 3
             and 40.00.
           5.Create a boolean variable that assigns the value true if the remainder in step 4 is 0 or false
             if it's not zero.
           6.Output the boolean variable
           7. Write an if-then statement that displays a message "Got some remainder" if the boolean in
             step 7 is not true
-------------------------------------------------------------------------------------------------------------
Created on: 21/05/2021
--------------------------------------------------------------------------------------------------------------
Last Update on: 21/05/2021
--------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //Step 1
        double myDoubleValue = 20.00d;

        //Step 2
        double mySecondDoubleValue= 80.00d;

        //Step 3
        double result = (myDoubleValue + mySecondDoubleValue) * 100.00d;

        //Step 4
        result %= 40.00d;

        //Step 5
        boolean isRemainderEqualsToZero = (result == 0)? true: false;

        //Step 6
        System.out.println("The value of isRemainderEqualsToZero is " + isRemainderEqualsToZero);

        //Step 7
        if(!isRemainderEqualsToZero)
            System.out.println("Got some remainder!");
    }
}
