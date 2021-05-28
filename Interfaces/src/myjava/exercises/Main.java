/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Interfaces
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);

        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
