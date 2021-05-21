/*
main.java
---------------------------------
Created by Eldr@e@
---------------------------------
Introduction to Logical Operators
---------------------------------
Created on : 21/05/2021
---------------------------------
Last Update on: 21/05/2021
---------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        int topScore = 100;
        if (topScore >= 100)
        {
            System.out.println("Congratulations! You got the high score!");
        }

        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore <100)
            System.out.println("Greater than the second top score and less than 100");
    }
}
