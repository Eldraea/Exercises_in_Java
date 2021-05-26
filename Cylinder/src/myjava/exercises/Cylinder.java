/*
Cylinder.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Cylinder class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Cylinder  extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

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
        return this.getArea()* this.height;
    }

}
