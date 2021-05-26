/*
Dog.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@ea
------------------------------------------------------------------------------------------------------------------------
The Dog class
------------------------------------------------------------------------------------------------------------------------
Created on 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Dog  extends Animal{


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        chew();

    }
    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }


}
