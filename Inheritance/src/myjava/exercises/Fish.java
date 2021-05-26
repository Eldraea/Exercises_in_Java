/*
Fish.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@ea
------------------------------------------------------------------------------------------------------------------------
The Fish class
------------------------------------------------------------------------------------------------------------------------
Created on 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;

    }

    private void rest()
    {
        System.out.println("Fish.rest() called");
    }

    private void swim(int speed)
    {
        System.out.println("Fish.swim() called");
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }

    private void moveMuscles()
    {
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFin()
    {
        System.out.println("Fish.moveBackFin() called");
    }
}
