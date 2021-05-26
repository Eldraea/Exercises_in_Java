/*
Holden.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Holden class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Holden --> accelerating";
    }

    @Override
    public String brake() {
        return "Holden --> braking";
    }

    @Override
    public String startEngine() {
        return "Holden --> Engine started";
    }
}
