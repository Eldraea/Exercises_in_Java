/*
Contact.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Contact class
------------------------------------------------------------------------------------------------------------------------
Created on : 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber)
    {
        return new Contact(name, phoneNumber);
    }
}
