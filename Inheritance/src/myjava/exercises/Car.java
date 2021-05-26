/*
Car.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@ea
------------------------------------------------------------------------------------------------------------------------
The Car class
------------------------------------------------------------------------------------------------------------------------
Created on 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Car extends Vehicle{


    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {

        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to: " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }


}
