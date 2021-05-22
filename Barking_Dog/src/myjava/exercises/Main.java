/*
Main.java
-------------------------------------
Created by Eldr@e@
--------------------------------------
Main class that tests BarkingDog Class
---------------------------------------
Created on : 22/05/2021
---------------------------------------
Last Update on: 22/05/2021
---------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));

    }
}
