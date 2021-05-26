/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: We are going to go back to the car analogy.
           Create a base class called Car. It should have a fex fields that would be appropriate for a
           generic car class: engine, cylinders, wheels, name etc.
           Constructors should initialize cylinders and name, and set wheels to 4 and engine to true. Cylinders and
           names would be passed parameters.
           Create appropriate getters. Create some methods like startEngine, accelerate, and brake.
           Show a message for each in the base class.
           Now create 3 sub classes for your favorite vehicles.
           Override the appropriate methods to demonstrate polymorphism in use.
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("MyCarName", 2);
        Ferrari ferrari = new Ferrari("MyFerrariName",3);
        Camaro camaro = new Camaro("MyCamaroName", 3);
        Porsche porsche = new Porsche("MyPorscheName", 3);

        car.startEngine();
        car.accelerate();
        car.brake();
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();
        camaro.startEngine();
        camaro.accelerate();
        camaro.brake();
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();


    }
}
