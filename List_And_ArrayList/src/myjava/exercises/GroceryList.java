/*
GroceryList.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The GroceryList class
------------------------------------------------------------------------------------------------------------------------
Create on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */



package myjava.exercises;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);

    }

    public void modifyGroceryItem(String newItem)
    {

    }
    public void modifyGroceryItem(int position, String item)
    {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position+1) + "has been modified.");
    }

    public void removeGroceryItem(int position)
    {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void  printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public String findItem(String searchedItem)
    {
        boolean exist = groceryList.contains(searchedItem);// returns true if the ArrayList contains the searchedItem
        int position = groceryList.indexOf(searchedItem); // returns the index position of our ArrayList
        if(position >= 0)
        {
            return groceryList.get(position);
        }
        return null;
    }
}
