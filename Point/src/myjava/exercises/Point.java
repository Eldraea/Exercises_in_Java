/*
Point.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Point.java class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt(Math.pow(- this.x, 2)+ Math.pow( - this.y,2));
    }

    public double distance(int x, int y)
    {
        return Math.sqrt(Math.pow((x- this.x), 2)+ Math.pow( (y- this.y),2));
    }
    public double distance(Point another)
    {
        return Math.sqrt(Math.pow((another.x- this.x), 2)+ Math.pow((another.y- this.y),2));
    }
}
