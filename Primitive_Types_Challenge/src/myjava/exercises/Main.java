/*
main.java
----------------
Created by Eldr@e@
------------------
Challenge: Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter.
           Create a short variable and set it to any valid short number
           Create an int variable dan set it to any valid int number
           Lastly, create a variable of type long and make it equal to 50_000 plus 10 times the sum of the byte plus the short plus the integer values.
--------------------
Created on: 21/05/2021
-----------------------
Last Update on: 21/05/2021
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {
        byte myByteVariable = 123;
        short myShortVariable = 32_000;
        int myIntVariable = 75_000;
        long myLongVariable = 50_000L + 10L *(myByteVariable + myIntVariable + myShortVariable);
        System.out.println(myByteVariable);
        System.out.println(myShortVariable);
        System.out.println(myIntVariable);
        System.out.println(myLongVariable);

    }
}
