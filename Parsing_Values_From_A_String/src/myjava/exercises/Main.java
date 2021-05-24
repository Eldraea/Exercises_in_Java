/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction of the parsing values from a string
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        String numberAsString2 = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        double number2 = Double.parseDouble(numberAsString2);
        System.out.println("number2 = " + number2);
    }
}
