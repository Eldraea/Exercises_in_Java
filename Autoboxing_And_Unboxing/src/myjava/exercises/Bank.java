/*
Bank.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Bank class
------------------------------------------------------------------------------------------------------------------------
Created on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfTheBranch) {
        int count = branches.size();
        Branch branch = new Branch(nameOfTheBranch);
        branches.add(branch);
        if (branches.size() != count )
            return true;
        else
            return false;
    }

    public boolean addCustomer(String nameOfTheBranch, String nameOfTheCustomer, double transaction) {

        if (branches.contains(findBranch(nameOfTheBranch))) {
            findBranch(nameOfTheBranch).newCustomer(nameOfTheCustomer, transaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String nameOfTheBranch, String nameOfTheCustomer, double transaction) {

        if(branches.contains(findBranch(nameOfTheBranch)))
        {
            findBranch(nameOfTheBranch).findCustomer(nameOfTheCustomer).addTransaction(transaction);
            return true;
        }
        return false;

    }

    public Branch findBranch(String nameOfTheBranch) {
        for(int i =0; i <branches.size(); i++)
        {
            if(branches.get(i).getName().equals(nameOfTheBranch))
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String nameOfTheBranch, boolean printTransactions) {

        if(printTransactions) {
            System.out.println("Branch: " + nameOfTheBranch);

          for(int i = 0; i < findBranch(nameOfTheBranch).getCustomers().size(); i++)
          {
              System.out.println("Customer: " + findBranch(nameOfTheBranch).getCustomers().get(i).getName());
              System.out.println("Transactions");
              for(int j = 0; j < findBranch(nameOfTheBranch).getCustomers().get(i).getTransactions().size(); j++)
              {
                  System.out.println("[" + (j+1)  + "] Amount " + findBranch(nameOfTheBranch).getCustomers().get(i).getTransactions().get(j));
              }
          }
            return true;
        }
        return false;
    }
}



