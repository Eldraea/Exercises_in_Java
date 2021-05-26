/*
Cuboid.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Cuboid class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height <0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {

        return height;
    }

    public double getVolume()
    {
        return this.getArea() * this.getHeight();
    }
}
