/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Encapsulation
Challenge: 1. Create a class and demonstrate proper encapsulation techniques.
              The class will be called Printer. I t will simulate a real Computer Printer. It should have fields for the
              toner Level, number of pages printed and also whether its a duplex printer (capable of printing on both
              sides of the paper).
           2. Add methods to ill up the toner (up to maximum of 100%), another method to simulate printing a page (which
              should increase the number of pages printed). Decide on the scope whether to use constructors, and
              anything else you think is needed.
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------

 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name ="Tim";
        player.health = 20;
        player.weapon ="Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "  + player.healthRemaining());

        damage = 10;
        player.health =100; // Cheating
        player.loseHealth(damage);
        System.out.println("Remaining health = "  + player.healthRemaining());

        //Encapsulation
        EnhancedPlayer  player2 = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is" + player2.getHealth());

        Printer printer = new Printer(50, false);

        printer.printAPage(9);
        System.out.println(printer.getNumberOfPagesPrinted());
        printer.printAPage(-1);
        System.out.println(printer.getNumberOfPagesPrinted());
        printer.printAPage(25);
        System.out.println(printer.getNumberOfPagesPrinted());




    }
}
