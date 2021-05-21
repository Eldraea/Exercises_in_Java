/*
main.java
----------------------------------------------------------
Created by Eldr@e@
----------------------------------------------------------
Primitive Types Recap and Introduction to String Data Type
-----------------------------------------------------------
Created on: 21/05/2021
-----------------------------------------------------------
Last Update on : 21/05/2021
-----------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //boolean
        //char

        String myString= " Welcome to the marvellous world of strings";
        System.out.println("myString is equal to " + myString);
        myString = myString + " ...and you haven't seen anything yet...";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);
        String numberString= "250.55";
        numberString = numberString + "49.50";
        System.out.println(numberString);
        String lastString =  "10";
        int myInt =50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
