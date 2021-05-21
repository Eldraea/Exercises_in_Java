/*
main.java
---------------------
Created by Eldr@e@
---------------------
Introduction to Float and Double Data Types
-----------------------
Created on: 21/05/2021
------------------------
Last Update on: 21/05/2021
-----------------------
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

        int myIntValue = 5;
        float myFloatValue = 5.25f; // same as (float)5.25
        double myDoubleValue = 5.25d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
    }
}
