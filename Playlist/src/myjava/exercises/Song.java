/*
Song.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Song class
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Song {

    private String title;
    private double duration;


    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format(this.title +": " + this.duration);
    }
}
