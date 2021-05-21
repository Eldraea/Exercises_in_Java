/*
primitive_types.java
--------------------------
Created by Eldr@ea
---------------------------
Introduction to Data type int and Overflows
-------------------------------------------
Created on : 21/05/2021
--------------------------------------------
Last Update on : 21/05/2021

 */
public class primitive_types {
    public static void main(String[] args)
    {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue );
        System.out.println("Integer Maximum Value = " + myMaxIntValue );
        System.out.println("Busted Max value =" + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted Min value =" + (myMinIntValue - 1)); // overflow

    }
}
