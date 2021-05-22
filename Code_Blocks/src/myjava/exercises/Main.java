/*
main.java
-----------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------------------------------------
Challenge: Following the example :
           1. Print ou a second score on the screen with the following
                - score set to 10_000
                - levelCompleted set to 8
                - bonus set to 200
             But make sure the first printout above stills displays as well
-----------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int secondScore = 10_000;
        int levelCompleted = 5;
        int bonus = 100;

        if( score ==4000)
            System.out.println("You're score was 4000!");
        System.out.println("This was executed as well"); // will be executed no matter what the value of score is

        if(score ==5000)
        {
            System.out.println("Congratulations you 've got all the point");

        }
        else if(score> 3000){
            System.out.println("Got here! That's pretty good");
        }
        else{
            System.out.println("Well... you'll do better next time!");
        }

        if (gameOver){
            int finalSCore = score + (levelCompleted * bonus); // finalScore cannot be used out of this code block
            System.out.println("Your final score is " + finalSCore);
            levelCompleted = 8;
            bonus = 200;
            finalSCore = secondScore +(levelCompleted * bonus);
            System.out.println("The second final score is " + finalSCore);
        }

    }
}
