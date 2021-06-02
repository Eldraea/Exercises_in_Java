/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
An Introduction to Collections
------------------------------------------------------------------------------------------------------------------------
Created on 02/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 02/06/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8,12);
        theatre.getSeats();

        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Please pay");
        }
        else
            System.out.println("Sorry, seat is taken");
        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Please pay");
        }
        else
            System.out.println("Sorry, seat is taken");
    }
}
