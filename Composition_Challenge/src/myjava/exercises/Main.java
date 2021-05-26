/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: This is an exercise in Class Composition. To complete the exercise, you must create five classes with
            associated member variables and methods.
            The five class should be created as follows:
            1. Create a class and name it Lamp.; Inside this class should be declared three member variables:
                 - style of type String,
                 - battery of type boolean
                 - globRating of type int
               All variables should be marked private. A constructor needs to be created which accepts the three member
               variables as parameters.
               In addition, four methods should also be created:
                 - turnOn() has return type and should print a message that the lamp is being turned on
                 - getGlobRating() returns the globRating of the lamp
            2. Create a class and name it Bed. Five private member variables should be declared:
                 - style of type String
                 - pillows of type int
                 - height of type int
                 - sheets of type int
                 - quilt of type int
                A constructor should be coded which accepts these five member variables as parameters. Also, six methods
                should be defined:
                 - make() has no return type and prints a message to effect that the bed is being made;
                 - getStyle() which return the value of style
                 - getPillows() returns the number of pillows
                 - getHeight() returns the height of the bed.
                 - getSheets() returns the number of sheets on the bed;
                 - getQuilt() returns the value of quilt
             3. Create a class with the name Ceiling. There are to member variables for this one
                 - height of type int
                 - paintedColor of type int
                There should also be a constructor which accepts both member variable as parameters. There are also two
                additional methods, which should be defined:
                 - getHeight() shall return the value of height
                 - getPaintedColor() should return the value of painted color
             4. Create a class with the name Wall. It contains one member variable : direction, and is of type String.
                A constructor for Wall should accept one parameter for the member variable direction. A getter should
                also be defined for the direction field called getDirection();
             5. Create a class with the name Bedroom. This class contains eight member variables;
                 - name of type String
                 - wall1 of type Wall
                 - wall2 of type Wall
                 - wall3 of type Wall
                 - wall4 of type Wall
                 - ceiling of type Ceiling
                 - bed of type Bed
                 - lamp of type Lamp
                The class constructor should accept all eight of the member variables as parameters, and there should
                also be two additional methods:
                  - getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is
                    being made and also calls the make() method in Bed class.
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("YOUR NAME HERE", wall1,wall2, wall3,wall4, ceiling, bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
