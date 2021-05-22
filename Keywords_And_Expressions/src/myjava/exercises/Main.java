/*
main.java
--------------------------------------------
Created by Eldr@e@
--------------------------------------------
A program that gives examples of expressions
---------------------------------------------
Created on: 22/05/2021
----------------------------------------------
Last Update on : 22/05/2021
----------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //In Java we cannot use keywords as variables
        int int2 = 5; //we cannot use int int = 5;

        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344); //kilometres = (100 * 1.609344) is an expression
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression!");
        }

        //In the following code I will type below, write down what part of the code are expressions

        int score = 100; // score = 100 is an expression
        if(score >99) //score > 99 is an expression
        {
            System.out.println("You've got the high score!"); //"You've got the high score" is an expression
            score = 0; //score = 0 is an expression
        }

    }

}
