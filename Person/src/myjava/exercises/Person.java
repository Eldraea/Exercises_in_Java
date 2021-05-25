/*
Person.java
------------------------------------------------------------------------------------------------------------------------
Created by Eld@e@
------------------------------------------------------------------------------------------------------------------------
The Person class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setFirstName(String name)
    {
        this.firstName = name;
    }

    public void setLastName(String name)
    {
        this.lastName = name;
    }

    public void setAge(int age)
    {
        if(age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen()
    {
        return (this.age >12 && this.age <20);
    }

    public String getFullName()
    {
        if(firstName.isEmpty() && lastName.isEmpty())
            return "";
        else if(firstName.isEmpty() && !lastName.isEmpty())
            return lastName;
        else if(!firstName.isEmpty() && lastName.isEmpty())
            return firstName;
        else
            return firstName + " " + lastName;
    }
}
