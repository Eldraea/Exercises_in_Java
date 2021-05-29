/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Create an abstract class to define items that can be stored in a tree.
            Implement the following:
            1. ListItem (abstract class)
               - It has three protected fields:
                   * ListIem called rightLink
                   * ListItem called leftLink
                   * Object called value
               - A constructor that takes an Object and initialises the field value with the parameter that was passed
                 in.
               - Seven methods:
                   * next(), is package-private and abstract
                   * setNext(), is package-private and abstract
                   * previous(), is package-private and abstract
                   * compareTo(), is package-private and abstract
                   * getValue(), takes no parameter and returns its value
                   * setValue(), takes an Object and assigns it to value.
           2. Node (concrete class)
               - It extends ListItem.
               - It has a constructor that takes an Object, then calls its parent constructor with the parameter that
                 was passed in.
               - Five methods which are package private:
                   * next(), takes no parameters and returns theListItem to its right;
                   * setNext(), takes a ListItem and sets it as its rightLink;
                   * previous(), takes no parameters and returns the ListItem to its left
                   * setPrevious(), takes a ListItem and sets it as its leftLink
                   * compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use the
                     value from ListItem for comparison. If this value is greater than value that was passed in, then it
                     should return a number greater than zero. If vice vesa, then it should return a number less than 0,
                     and zero if equal.
            3. MyLinkedList
              - It implements NodeList
              - It has one field of type ListItem called root
              - A constructor that takes a ListItem and initialises the field root with the newly passed in parameter
              - Four methods:
                 * getRoot(), getter for root
                 * addItem(), takes a ListItem and returns true if it was added successfully or false otherwise. If the
                   item is already present, it doesn't get added. Use compareTo() to place the item in its proper order
                 * removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise
                 * traverse(), takes the root as argument and does not return anything. If the root is null it prints
                   out : "The list is empty", otherwise print each value on separate line



------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
-----------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
