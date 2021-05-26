/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Composition
Challenge: 1. Create a single room of the house using composition. Think about the things that should be included in the
              room. Maybe physical parts of the house but furniture as well. Add at least one method to access an object
              via a getter and then at least one method to hide the object e.g not using a getter but to access the
              object used in composition within the main class.
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor= new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("B1-200", "Asus", 4,6, "v2.44");

        PC pc = new PC(theCase, monitor,motherBoard);

       pc.powerUp();
       Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Bedroom1",wall1,wall2, wall3,wall4,ceiling, bed, lamp);

        bedroom.makingBed(bed);
        bedroom.getLamp().turnOn();



    }
}
