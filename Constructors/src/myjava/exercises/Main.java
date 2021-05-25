/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Constructors
Challenge: 1. Create a new class for a bank account.
           2. Create fields for the account: number, balance, customer name, email and phone number.
           3. Create getters and setters for each field
           4. Create two additional methods
                - 1.To allow customer to deposit funds. (this should increment the balance field)
                - 2.To allow the customer to withdraw funds. (this should deduct from the balance field, but not allow
                    the withdrawal to complete if their are insufficient funds.
              You will want to create various code in the Main Class (the one created by IntelliJ) to confirm your code
              is working.
            5. Add some System.out.println's in the two methods above as well.
            6.Create a new class VipCustomer. it should have 3 fields: name, creditLimit and emailAddress
            7.Create 3 constructors
                - 1st constructor empty should call the constructor with 3 parameters with default values
                - 2nd constructor  should pass on the two values it receives and add a default value for the third one
                - 3rd constructor should save all fields
            8. Create Getters only for this using code generation of intellij as setters won't be needed
            9. Test and confirm it works
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class Main {



    public static void main(String[] args) {


        //BankAccount
        BankAccount bobsAccount = new BankAccount();

        bobsAccount.withdrawFunds(100.00);
        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(100.00);

        bobsAccount.depositFunds(51.00);
        bobsAccount.withdrawFunds(100.00);

        //VipCustomer

        VipCustomer rileysAccount = new VipCustomer();
        VipCustomer mariesAccount = new VipCustomer("Marie", 20_000);
        VipCustomer oreosAccount = new VipCustomer("Kitty kitty", 150_000,
                "yummy@cutiekitty.com");
        System.out.println(rileysAccount.getCustomerName());
        System.out.println(rileysAccount.getCreditLimit());
        System.out.println(rileysAccount.getEmailAddress());
        System.out.println(mariesAccount.getCustomerName());
        System.out.println(mariesAccount.getCreditLimit());
        System.out.println(mariesAccount.getEmailAddress());
        System.out.println(oreosAccount.getCustomerName());
        System.out.println(oreosAccount.getCreditLimit());
        System.out.println(oreosAccount.getEmailAddress());
    }
}
