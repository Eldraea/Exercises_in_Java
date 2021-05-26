/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to inheritance
Challenge: 1. Start with a base class of a vehicle, then create a Carr class that inherits from this base class.
            Finally, create another class, a specific type of Car that inherits from the Car Class.
            You should be able to hand steering, changing gears, and moving (speed in other words).
            You will want to decide where to put the appropriate state and behaviours (fields and methods).
            As mentioned above, changing gears, increasing/decreasing speed should be included.
            For your specific type of vehicle you will want to add something specific for that type of car.
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal" , 1,1,5,5);

        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");

        dog.eat();
        dog.walk();
        dog.run();

        //Challenge

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(50);
    }
}
