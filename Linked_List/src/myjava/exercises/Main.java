/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Linked Lists
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(3);
        myList.add(4);

        for(int i = 0; i < myList.size(); i++)
            System.out.println(i+ ": " + myList.get(i));

        myList.add(1,2);

        for(int i = 0; i < myList.size(); i++)
            System.out.println(i+ ": " + myList.get(i));


    }


}

