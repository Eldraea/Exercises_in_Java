/*
ITelephone.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The ITelephone interface
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public interface ITelephone {
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone (int phoneNumber);
     boolean isRinging();

}
