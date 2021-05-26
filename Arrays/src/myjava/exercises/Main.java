/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to Arrays
Challenge: 1. Create a program using arrays that sorts a list of integers in descending order.
              Set up the program soo that numbers to sort are read in from the keyboard.
              Implement the following methods: getIntegers, printArray and sortIntegers
                    - getIntegers returns an array of entered integers from keyboard
                    - printArray prints out the contents of the array
                    - sortIntegers should sort the array and return a new array containing the sorted numbers.
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int[] myIntArray = SortedArray.getIntegers(5);


        SortedArray.printArray(SortedArray.sortIntegers(myIntArray));
        //System.out.println(getAverage(myIntArray));

    }





    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i =0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

       return sum/array.length;
    }

}
