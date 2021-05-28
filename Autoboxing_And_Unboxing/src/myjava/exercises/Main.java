/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Autoboxing and Unboxing
Challenge: Your job is to create a simple banking application.
            Implement those following classes:
            1. Bank
                It has two fields:
                    - a String called name
                    - an ArrayList that holds objects of type Branch called
                branches.
                And five methods:
                   - addBranch(), has one parameter of type String(name of the branch) and returns a boolean. It returns
                   true if the branch was added successfully or false otherwise.
                   - addCustomer(), has three parameters of type String nameOfTheBranch, String nameOfTheCustomer,
                     double initialTransaction and returns a boolean. It returns true if the customer was added
                     successfully or false otherwise.
                  - addCustomerTransaction(), has three parameter sof type String nameOfTheBranch, String
                  nameOfTheCustomer, double transaction and returns a boolean. It returns true if the customers
                  transaction was added successfully or false otherwise.
                  -findBranch(), has one parameters of type String nameOfTheBranch and returns a Branch if it exists or
                  null otherwise.
                  -listCustomers(), has two parameters of type String nameOfTheBranch, boolean printTransactions and
                  returns a boolean. Return true if the branch exists or false otherwise. This methods prints out a list
                  of customers.
            2. Branch
               It has two fields:
                  - a String called name
                  - an ArrayList that holds objects of type Customer called
               customers.
               A constructor that takes a String(nameOfTheBranch). It initialises name and instantiates customers.
               And five methods:
                  - getName(), getter for name
                  - getCustomers(), getter for customers
                  - newCustomer(), has two parameters of type String nameOfTheCustomer, double initialTransaction and
                    returns a boolean. Returns true if the customer was added successfully or false otherwise.
                  - addCustomerTransaction(), has two parameters of type String nameOfTheCustomer, double transaction
                    and returns a boolean. Return true if the customers transaction was added successfully or false
                    otherwise.
                  - findCustomer(), has one parameter of type String nameOfTheCustomer and returns a Customer. Return
                    the Customer if they exist, null otherwise.
            3. Customer
               It has two fields:
                  - a String called name
                  - an ArrayList that holds objects of type Double called transactions.
               A constructor that takes a String nameOfTheCustomer and a double initialTransaction. It initialises
               name and instantiates transactions.
               And three methods:
                  - getName(), getter for name
                  - getTransactions(), getter for transactions
                  - addTransaction(), has one parameter of type double transaction, and doesn't return anything.
------------------------------------------------------------------------------------------------------------------------
Created on : 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("LCL");
        bank.addBranch("Riley");
        bank.addBranch("Helen");
        bank.addBranch("Jolene");
        bank.addCustomer("Riley","Tom", 2.71);
        bank.addCustomer("Riley","Ulysse", 4.5);
        bank.addCustomer("Helen","Jane", 64.75);
        bank.addCustomer("Helen","Emily", 19.25);
        bank.addCustomer("Jolene","Margaret", 9.71);
        bank.addCustomer("Jolene","Alan", 4.21);
        bank.addCustomerTransactions("Riley","Tom", 2.00);
        bank.listCustomers("Riley", true);
        bank.addCustomerTransactions("Jolene","Alan", 8.72);
        bank.addCustomerTransactions("Jolene","Alan", 3.67);
        bank.addCustomerTransactions("Jolene","Alan", 19.57);
        bank.addCustomerTransactions("Jolene","Alan", 4.79);
        bank.listCustomers("Jolene", true);


    }
}
