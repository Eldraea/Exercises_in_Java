/*
main.java
-----------------------------------------------
Created by Eldr@e@
-----------------------------------------------
Introduction to the concept of methods in Java
------------------------------------------------
Created on: 22/05/2021
-------------------------------------------------
Last Update on: 22/05/2021
-------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;

    }
    public static void main(String[] args) {
        boolean gameOver  = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(calculateScore(gameOver,score, levelCompleted, bonus));

       score = 10_000;
       levelCompleted = 8;
       bonus = 200;
        System.out.println(calculateScore(gameOver,score, levelCompleted, bonus));

    }
}
