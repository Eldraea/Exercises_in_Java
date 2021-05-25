/*
VipCustomer.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The VipCustomer class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class VipCustomer {


    private String customerName;
    private double creditLimit;
    private String emailAddress;



    public VipCustomer() {
        this("Default Name", 10_000.00, "Default Email Address");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "Default Email Address");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
