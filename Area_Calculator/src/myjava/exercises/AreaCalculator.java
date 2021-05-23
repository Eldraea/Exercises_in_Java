/*
AreaCalculator.java
--------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
--------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named area with one double parameter named radius.
           The methods needs to return a double value that represents the area of a circle.
           If the parameter radius is negative then return -1.0 to represent and invalid value.
           2. Write another overloaded method with 2 parameters x and y(both doubles), where x and y represent
           the sides of a rectangle.
           The methods needs to return an area of a rectangle.
           If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
---------------------------------------------------------------------------------------------------------------
Created on : 23/05/2021
---------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
---------------------------------------------------------------------------------------------------------------

 */

package myjava.exercises;

public class AreaCalculator {

    public static final int BAD_VALUE = -1;

    public static double area( double radius)
    {
        if(radius <0)
            return BAD_VALUE;
        else
            return Math.pow(radius, 2) * Math.PI;
    }

    public static double area( double x, double y)
    {
        if( x<0 || y<0)
            return BAD_VALUE;
        else
            return x* y;

    }
}
