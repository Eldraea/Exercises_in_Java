/*
Branch.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Branch class
------------------------------------------------------------------------------------------------------------------------
Created on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;


import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfTheCustomer, double initialTransaction)
    {
        Customer customer = new Customer(nameOfTheCustomer, initialTransaction);
        int count = customers.size();
        customers.add(customer);
        if(customers.size()== count + 1)
            return true;
        else if(customers.contains(customer))
            return false;
        else
            return false;
    }

    public boolean addCustomerTransaction(String nameOfTheCustomer, double transaction)
    {

        if(customers.contains(findCustomer(nameOfTheCustomer))) {
            findCustomer(nameOfTheCustomer).addTransaction(transaction);
            return true;
        }
        else
            return false;

    }

    public Customer findCustomer(String nameOfTheCustomer)
    {
        for(int i =0; i <customers.size(); i++)
        {
            if(customers.get(i).getName().equals(nameOfTheCustomer))
                return customers.get(i);
        }
        return null;
    }
}
