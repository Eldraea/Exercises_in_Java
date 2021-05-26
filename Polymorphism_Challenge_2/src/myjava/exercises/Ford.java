/*
Ford.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Ford class
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerating";
    }

    @Override
    public String brake() {
        return "Ford --> braking";
    }

    @Override
    public String startEngine() {
        return "Ford --> Engine started";
    }
}
