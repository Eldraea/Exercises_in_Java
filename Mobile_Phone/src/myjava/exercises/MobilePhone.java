/*
MobilePhone.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The MobilePhone class
------------------------------------------------------------------------------------------------------------------------
Created on : 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

import java.util.ArrayList;

public class MobilePhone {

     private String myNumber;
     private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact)
    {
        if(!myContacts.contains(contact))
        {
            myContacts.add(contact);
            return true;
        }
        else
            return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        if(myContacts.contains(oldContact))
        {
            int position = myContacts.indexOf(oldContact);
            myContacts.set(position, newContact);
            return true;
        }
        else
            return false;
    }

    public boolean removeContact(Contact contact)
    {
        if(myContacts.contains(contact))
        {
            myContacts.remove(contact);
            return true;
        }
        else
            return false;

    }

    public int findContact(Contact contact)
    {
        if(myContacts.contains(contact))
            return myContacts.indexOf(contact);
        else
            return -1;
    }

    public int findContact(String string)
    {

        for(int i =0; i < myContacts.size(); i++)
        {
            if(myContacts.get(i).getName().equals(string))
                return myContacts.indexOf(myContacts.get(i));
        }
        return -1;
    }

    public Contact queryContact(String string)
    {
        if(findContact(string) > 0)
            return myContacts.get(findContact(string));
        else
            return null;

    }

    public void printContact()
    {
        System.out.println("Contact List:");
        for(int i = 0; i< myContacts.size(); i++)
        {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());

        }
    }

}
