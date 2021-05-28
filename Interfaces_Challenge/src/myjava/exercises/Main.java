/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Create a simple interface that allows an object to be saved to some sort of storage medium.
           Implement the following:
           1. ISaveable (Interface)
            - it has two methods:
                * write(), takes no arguments and returns a List containing objects of type String
                * read(), takes a List of type String and doesn't return anything
           2. Player (class)
             - it has four fields:
                * String called name
                * String called weapon
                * int called hitPoints
                * int strength
             - A constructor that accepts a String name and two ints hitPoints, and strength. It initialises name
               hitPoints and strength with the newly passed in values. It initialises weapon with the default weapon
               "Sword".
             -Eleven methods:
               - getters and setters for all four fields
               - write(), same as interface. Return a List of the fields in the order they appear in toString().
               - read(), same as interface. Store the values in the List, in the order they appear in toString().
                Make sure the List is not null and the size() is greater than 0 before storing the values.
               - toString(), Player's overriding toString() method. It takes no arguments and returns a String in the
                 following format:
                 "Player{name = 'Tim', hitPoints=10, strength=15, weapon='Sword'}
            3. Monster (class)
               - It has three fields:
                 * a String called name
                 * a int called hitPoints
                 * a int called strength
              - A constructor that accepts a String name, and two ints hitPoints and strength. It initialises name
                hitPoints and strength with the newly passed in values..
              - Six methods:
                 * Only getters for three fields.
                 * write(), same as interface.Return a List of the fields in the order they appear in toString()
                 * read() , same as interface. Store the values in the List, in th order they appear in toString(). Make
                   sure the List is not null and the size() is greater than 0 before storing the values.
                 * toString(), Monsters overriding toString() method. It takes no argument and returns a String in the
                    following format.
                    "Monster{name='Werewolf', hitPoints=20, strength=40}
------------------------------------------------------------------------------------------------------------------------
Created on 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        ISaveable player = new Player("Tim", 10, 15);
        System.out.println(player.toString());
        ((Player) player).setHitPoints(8);
        System.out.println(player.toString());

        ISaveable monster = new Monster("Maleficient", 17, 8);
        System.out.println(monster.toString());



    }
}

