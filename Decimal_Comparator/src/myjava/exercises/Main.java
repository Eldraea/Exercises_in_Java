/*
Main.java
------------------------------------------------
Created by Eldr@e@
-------------------------------------------------
Main class that tests the DecimalComparator Class
-------------------------------------------------
Created oon : 22/05/2021
--------------------------------------------------
Last Update on : 22/05/2021
--------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {


        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1756,3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));

    }
}
