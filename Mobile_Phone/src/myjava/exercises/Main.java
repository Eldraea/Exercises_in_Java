/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Create a program that implements a simple mobile phone with the following capabilities.
           1. Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following
              attributes.
                 - Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
                 - A constructor that takes a String(the phone number) and initialises myNumber and instantiates
                   myContacts.
                 - And seven methods:
                    * addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the
                      contact doesn't exist, or false if the contact already exists.
                    * updateContact(), has two parameters of type Contact (the old contact will be updated with the new
                      contact) and returns a boolean. Returns true if the contact exists and was updated successfully,
                      or false, if the contact doesn't exist.
                    * removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the
                      exists and as removed successfully, or false if the contact doesn't exist.
                    * findContact(), has one parameter of type Contact and returns an int. The returned value is its
                      position in the ArrayList, it will either be -1( doesn't exist) or a value greater than or equal
                      to 0(does exist).
                    * findContact(), same as above, only it has one parameter of type String.
                    * queryContact(), has one parameter of type String and returns a Contact. Use the string to search
                      for the name and then return the Contact. Return Null otherwise.
                    * printContact(), has no parameters and doesn't return anything. Print the contacts in the
                      following format:
                          Contact List:
                          1. Bob -> 31415926
                          2. Alice -> 161180339
                          3. Tom -> 11235813
                          4. Jane -> 2351113

           2. Implement the Contact class with the following attributes:
                 - Two fields, both String, one called name and the other phoneNumber
                 - A constructor that takes two Strings, and initialises name and phoneNumber
                 - Three methods:
                      * getName(), getter for name
                      * getPhoneNumber(), getter for phoneNumber
                      * createContact(), has two parameters of type String (the persons name and phone number) and
                        returns an instance of Contact. This is the only method that is static.

------------------------------------------------------------------------------------------------------------------------
Create on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

       Contact bob=  Contact.createContact("Bob", "31415926");
       Contact alice =  Contact.createContact("Alice", "16180339");
       Contact tom = Contact.createContact("Tom", "11235813");
       Contact jane =  Contact.createContact("Jane", "23571113");
       Contact marie =  Contact.createContact("Marie", "47859657");
       Contact victor = Contact.createContact("Victor", "45879632");

        MobilePhone myMobile = new MobilePhone("12345678");
        myMobile.addNewContact(bob);
        myMobile.addNewContact(alice);
        myMobile.addNewContact(tom);
        myMobile.addNewContact(jane);
        myMobile.addNewContact(marie);

        myMobile.printContact();
        myMobile.updateContact(marie, victor);

        myMobile.printContact();

        myMobile.removeContact(victor);
        myMobile.printContact();

        System.out.println(alice.getName() +" is the " + (myMobile.findContact("Alice") + 1 ) + " contact of my list");
        System.out.println(bob.getName() + " is the " + (myMobile.findContact(bob) + 1) + " contact of my list");

        System.out.println("My " + (myMobile.findContact("Tom")+ 1)+ "rd contact is " +
                myMobile.queryContact("Tom").getName() + " and his phone number is "
                + myMobile.queryContact("Tom").getPhoneNumber());


    }
}
