/*
Ferrari.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Ferrari class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */




package myjava.exercises;

public class Ferrari extends Car{

    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari started");
    }

    @Override
    public void accelerate() {
        System.out.println("Hey look my Ferrari is going faster");
    }

    @Override
    public void brake() {
        System.out.println("My Ferrari is stopping");
    }
}
