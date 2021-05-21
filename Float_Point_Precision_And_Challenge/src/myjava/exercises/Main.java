/*
main.java
-----------------------
Created by Eldr@e@
-----------------------
Challenge: Convert a given number of pounds to kilograms
            STEPS: 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
                   2. Calculate the result i.e the number of kilograms based on the contents of the variable above and
                      store the result in a second appropriate variable.
                   3. Print out the result
            HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.
------------------------
Created on: 21/05/2021
------------------------
Last Update on: 21/05/2021
------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f; // same as (float)5.25
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        //Challenge

        //Step One
        double myPoundsValue = 809d;

        //Step Two
        double myKilogramsValue =  myPoundsValue * 0.45359237d;

        //Step Three
        System.out.println( myPoundsValue + " pounds is equal to " + myKilogramsValue + " kilograms.");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_596_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
