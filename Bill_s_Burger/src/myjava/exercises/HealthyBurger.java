/*
HealthyBurger.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The HealthyBurger class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class HealthyBurger extends Hamburger{



    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price)
    {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price)
    {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {

        double totalPrice = super.itemizeHamburger();
        if(!healthyExtra1Name.isEmpty() && healthyExtra1Price!=0) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            totalPrice =totalPrice + healthyExtra1Price;
        }
        if(!healthyExtra2Name.isEmpty() && healthyExtra2Price!=0) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
             totalPrice = totalPrice +healthyExtra2Price;
        }
        return totalPrice;
    }
}
