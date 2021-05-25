/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: You have to represents a point in 2D space.
            Write a class with the name Point. The class needs two fields (instance variables) with name x and y of
            type int.
            The class needs to have two constructor:
                - the first constructor does not have any parameters (no-arg constructor).
                - the second constructor has parameters x and y of type int and it needs to
                initialize the fields.
            Write the following methods (instance methods):
                - Method named getX without any parameters, it needs to return the value of x field
                - Method named getY without any parameters, it needs to return the value of y field
                - Method named setX with one parameter of type int, it needs to set the value of the x field
                - Method named setY with one parameter of type int , it needs to set the value of the y field
                - Method named distance without any parameters, it needs to return the distance between this Point
                   and Point 0,0 as double
                - Method named distance with two parameters, x, y  both of type int, it needs to return the
                distance between this Point and Point x,y as double
                - Method named distance with parameter another  of type Point, it needs to return the
                  distance between this Point and another Point as double.
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
