/*
MobilePhone.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The MobilePhone class
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
*/
package myjava.exercises;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn)
        System.out.println("Now ringing " + phoneNumber);
        else
            System.out.println("Phone is switched off");
    }

    @Override
    public void answer() {
        if(isRinging)
            System.out.println("Answering the mobile phone");
        isRinging= false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber== myNumber && isOn)
        {
            isRinging= true;
            System.out.println("Melody ring");
        }
        else{
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
