/*
Car.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Car class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}