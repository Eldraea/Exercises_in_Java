/*
Mitsubishi.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Mitsubishi class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Mitsubishi extends Car {

    public Mitsubishi( int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> braking";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> Engine started";
    }
}
