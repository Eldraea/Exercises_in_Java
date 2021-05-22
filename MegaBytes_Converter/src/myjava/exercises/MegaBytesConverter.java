/*
MegaBytesConverter.java
-----------------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------------
Challenge: Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int
           with the name kiloBytes.
           The methods should not return anything(void) and it needs to calculate the megabytes
           remaining kilobytes from the kilobytes parameter.
           Then it needs to print a message in the format "XX KB = YY MB and ZZ KB"
                XX represents the original value kiloBytes
                YY represents the calculated megabytes
                ZZ represents the calculated remaining kilobytes.
----------------------------------------------------------------------------------------------
 Created on: 22/05/2021
 ---------------------------------------------------------------------------------------------
 Last Update on: 22/05/2021
 ----------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {

        if(kiloBytes <0)
            System.out.println("Invalid Value");
        else
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 +" MB and " + kiloBytes%1024 + " KB");
    }
}
