/*
main.java
--------------------------------------------------------------------------------------
Created by Eldr@e@
--------------------------------------------------------------------------------------
A program that shows differences between assignment operator and "equals to" operator
--------------------------------------------------------------------------------------
Created on: 21/05/2021
--------------------------------------------------------------------------------------
Last Update on: 21/05/2021
--------------------------------------------------------------------------------------
 */
package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        int newValue = 50; //Assignment Operator
        if(newValue == 50 ) //We test if the values are equals to each other
            System.out.println("My new value is 50! Yay!");

        boolean isCar= false; // Assignment Operator
        if(isCar)
            System.out.println("This wasn't supposed to happen");
    }
}
