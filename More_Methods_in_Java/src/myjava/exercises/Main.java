/*
main.java
------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------
Challenge:1. Create a method called displayHighScorePosition: it should receive a player's name as
           a parameter, and a second parameter as a position in the high score table. You should
           display the player's name along with the message like " managed to get into position"
           and the position they got and a further message "on the high score table".
          2. Create a second method called calculateHighScorePosition : it should be sent one argument
           only, the player's score. It should return an int. The return data should be;
              1 if the score is >= 1_000
              2 if the score is >= 500 and <1_000
              3 if the score os >=100 and <500
              4 in all other cases
           3. Call both methods and display the results of the following: a score of 1500,900, 400, and 50
------------------------------------------------------------------------------------------------------------
Created on: 22/05/2021
-------------------------------------------------------------------------------------------------------------
Last update on : 22/05/2021
-------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void displayHighScorePosition(String playerName, int  position)
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1_000)
            return 1;
        else if((playerScore>=500) && (playerScore <1_000))
            return 2;
        else if((playerScore>=100) && (playerScore <500))
            return 3;
        else
            return 4;

    }
    public static void main(String[] args) {

        displayHighScorePosition("Jolene", calculateHighScorePosition( 1_500));
        displayHighScorePosition("Julien", calculateHighScorePosition( 900));
        displayHighScorePosition("Elise", calculateHighScorePosition( 400));
        displayHighScorePosition("Nicolas", calculateHighScorePosition( 50));




    }
}
