/*
Camaro.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Camaro class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Camaro extends Car{

    public Camaro(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Camaro started");
    }


    @Override
    public void accelerate() {
        System.out.println("Hey look my Camaro is going faster");
    }

    @Override
    public void brake() {
        System.out.println("My Camaro is stopping");
    }
}
