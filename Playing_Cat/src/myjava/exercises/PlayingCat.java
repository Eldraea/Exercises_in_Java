/*
PlayingCat.java
--------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
--------------------------------------------------------------------------------------------------------------
Challenge: Cats spend most of the day playing. In particular, they play if the temperature is between 25 and
           35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
           Write a method is CatPlaying that has 2 parameters. Method needs to return true if the cat is
           playing, otherwise return false
                1st parameter should be of type boolean and be named summer. It represents if it is summer
                2nd parameter represents the temperature and is of type int with the name temperature.
--------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
--------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
--------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        boolean catPlaying = false;

        if(!summer && temperature >=25 && temperature<=35)
            catPlaying = true;
        else if
        (summer && temperature >=25 && temperature <=45)
            catPlaying = true;
        return catPlaying;
    }
}
