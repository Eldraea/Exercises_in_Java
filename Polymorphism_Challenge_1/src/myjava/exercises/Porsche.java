/*
Porsche.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Porsche class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Porsche extends Car{

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche started");
    }


    @Override
    public void accelerate() {
        System.out.println("Hey look my Porsche is going faster");
    }

    @Override
    public void brake() {
        System.out.println("My Porsche is stopping");
    }
}
