/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a class with the name Wall. The class needs two fields (instance variables) with name width and
              height of type double.
              The class needs to have two constructors:
                 - the first constructor does not have any parameters(no-arg constructor).
                 - the second constructor has parameter width and height of type double and it needs to initialize the
                    fields.
                 In case the width is less than 0 it needs to et the width field value to 0.
                 In case the height parameter is less than 0 it needs to set the height field value to 0

            2. Write the following methods (instance methods):
                  - Method named getWidth without any parameters, it needs to return the value of width field
                  - Method named getHeight without any parameters, it needs to return the value of height field
                  - Method named setWith with one parameter of type double, it needs to set the value of the width field
                    If the parameter is less than 0 it needs to set the height field value to 0;
                  - Method named setHeight with one parameter of type double, it needs to set the value of the height
                    field.
                    If the parameter is less than 0, it needs to set the height to 0.
                  - Method named getArea without any parameters, it needs to return the area of the wall
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall(5,4);


        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
