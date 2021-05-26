/*
Hamburger.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Hamburger class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.math.BigDecimal;

public class Hamburger {

    //Four basic ingredients
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //Separate variables for four possible additions to the hamburger
    private String addition1Name ;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name ;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Price =0;
        this.addition2Price = 0;
        this.addition3Price = 0;
        this.addition4Price = 0;
        this.addition1Name = "";
        this.addition2Name = "";
        this.addition3Name = "";
        this.addition4Name = "";
        System.out.println(name +" on "+this.breadRollType + " with " + this.meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;

    }
    public void addHamburgerAddition2(String name, double price)
    {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price)
    {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price)
    {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger()
    {

        if(!addition1Name.isEmpty() && addition1Price!=0) {
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
            this.price += addition1Price;
        }
        if(!addition2Name.isEmpty() && addition2Price!=0) {
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
           this.price += addition2Price;
        }
        if(!addition3Name.isEmpty() && addition3Price!=0) {
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
            this.price += addition3Price;
        }
        if(!addition4Name.isEmpty() && addition4Price!=0) {
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
            this.price += addition4Price;
        }

        return this.price;
    }
}
