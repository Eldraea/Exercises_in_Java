/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Main class that tests the FlourPacker class
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
        System.out.println(FlourPacker.canPack(2,2,11));
        System.out.println(FlourPacker.canPack(-3,2,12));
        System.out.println(FlourPacker.canPack(5,3,24));
        System.out.println(FlourPacker.canPack(2,1,5));


    }
}
