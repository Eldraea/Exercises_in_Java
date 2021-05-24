/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Main class that tests the NumberToWords class
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        System.out.println(NumberToWords.reverse(-234));
        System.out.println(NumberToWords.getDigitsCount(0));
        NumberToWords.numberToWords(562);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(0);

    }
}
