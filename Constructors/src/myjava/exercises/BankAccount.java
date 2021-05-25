/*
BankAccount.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The BankAccount class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String email;


    public BankAccount(String customerName, String phoneNumber, String email) {
        this(99999, 100.55, customerName,phoneNumber,email);

    }

    public BankAccount()
    {

        this(12345, 0.00, "Bob Brown","(087) 123-456","myemail@bob.com");
        System.out.println("Empty constructor");
    }

    public BankAccount(int number, double balance, String customerName, String phoneNumber, String email)
    {
        System.out.println("BankAccount Constructor with parameter called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public int getNumber()
    {
        return this.number;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getCustomerName ()
    {
        return this.customerName;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setBalance( double balance)
    {
        this.balance = balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public boolean depositFunds(double funds)
    {
        balance += funds;
        System.out.println("You 've just received money");
        return true;
    }

    public boolean withdrawFunds(double funds)
    {
        if(this.balance - funds < 0) {
            System.out.println("Sorry you have not enough funds to withdraw funds");
            return false;
        }
        else
        {
            balance -= funds;
            System.out.println("Withdraw Completed");
            return true;
        }
    }
}
