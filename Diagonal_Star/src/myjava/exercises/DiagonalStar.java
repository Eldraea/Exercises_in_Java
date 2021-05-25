/*
DiagonalStar.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named printSquareStar with one parameter of type int named number
               If the number is <5, the method should print "Invalid Value".
               The method should print diagonals to generate a rectangular pattern composed of stars(*). This should
               be accomplished by using loops.
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class DiagonalStar {

    public static void printSquareStar(int number)
    {

        if(number <5)
            System.out.println("Invalid Value");

        else{
            for(int i = 1; i<= number; i++)
            {
                for(int j = 1; j <=number; j++)
                {
                    if(i==1 || i==number|| j==1||j==number||j==i|| j==(number-i+1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
