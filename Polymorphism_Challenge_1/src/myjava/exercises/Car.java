/*
Car.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Car class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void accelerate()
    {
        System.out.println("Hey look I am going faster");
    }

    public void brake()
    {
        System.out.println("I am stopping");
    }

    public void startEngine(){
        System.out.println("Engine started");
    }
}


