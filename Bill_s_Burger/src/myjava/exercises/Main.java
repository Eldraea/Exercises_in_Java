/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: The purpose of this application is to help a company called Bill's Burgers manage the process of selling
            their hamburgers. An din order to match Bill's menu, you will need to create three classes: Hamburger,
            DeluxeBurger, and HealthyBurger.
            1. For the base Hamburger class, there will need to be four variables to represent the four basic
               ingredients of the hamburger, name, meat, price and breadRollType. The price variable should be of type
               double, while the other three are of type String. A constructor will be needed to accept these four
               values as parameter when creating a new hamburger.
               There will also need to be separate variables for four possible additions to the hamburger. Those should
               be declared with these names: addition1Name,addition1Price, addition2Name, addition2Price, addition3Name,
               addition3Price, addition4Name, addition4Price. The name variables should be of type String and the price
               variables should be of type double.
               Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to
               the hamburger and one(1) for printing out an itemized listing iof the final hamburger with addons, if
               any, and the total price.
               Remember that a name and a price must be accepted as parameters in the first four methods so that the
               price of the hamburger is adjusted accordingly.
               These methods should be named addHamburgerAddition, addHamburgerAddition, addHamburgerAddition3,
               addHamburgerAddition4, and itemizehamburger.
               The first four methods do not return values, but the last method does not return the total price of the
               hamburger of type double, which includes the base price of the hamburger plus any additional items.
            2. For the second class, DeluxeBurger, there are no additional member variables and the constructor accepts
               no parameters. Instead, the constructor creates a deluxe burger with all the fixings and Chips and a
               drink for a base price of $19.10. The constructor can be configured in any way, as long as chip and drink
               are added for the total price just mentioned. In the class, the four(4) methods defined in the Hamburger
               class for including additional toppings must each be overridden so that message is printed stating that
               no additional items can be added to a deluxe burger.
            3. And for the third class, Healthy, there will be four(4) additional member variables called
               healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price. The named are type
               String and the prices are type double. The constructor for this class accepts two parameters for meat
               and price. Those are set in the constructor along with an appropriate name for the type of burger.
               Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept name and
               price for the addition, allowing for up two addons to the basic healthy burger. And finally
               itemizeHamburger method created in the hamburger class should bo overridden to generate a message
               appropriate to the tpe of burger along ith any addons. The method also returns the total price of
               healthy burger of type double.
------------------------------------------------------------------------------------------------------------------------
Created on 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic hamburger", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Eggs", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + String.format("%.2f",db.itemizeHamburger()));


    }
}
