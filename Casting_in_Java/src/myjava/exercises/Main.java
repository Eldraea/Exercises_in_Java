/*
main.java
-----------------------
Created by Eldr@e@
-----------------------
Introduction to casting in java
-----------------------
Created on: 21/05/2021
-----------------------
Last Update on : 21/05/2021
-----------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //For integers

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" Integer Minimum value = " + myMinIntValue);
        System.out.println(("Integer Maximum value = " + myMaxIntValue));
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //overflow

        //For bytes
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value= " + myMaxByteValue);

        //For shorts
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        //For Longs
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        short bigShortLiteralValue = 32_767;
        int myTotal =(myMinIntValue/2); // result is an int
        byte  myNewByteValue = (byte)(myMinByteValue/2); // result is now a byte
        short myNewShortValue = (short)(myMinShortValue/2); // result is now a short

        System.out.println(bigShortLiteralValue);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
        System.out.println(myTotal);
    }
}
