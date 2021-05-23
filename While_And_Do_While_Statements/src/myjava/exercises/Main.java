/*
main.java
-----------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to While and Do-While statements
Challenge:  1. Create a method called isEvenNumber that takes a parameter of type int.
            It's purpose is to determine if the argument passed to the method is an even number or not.
            return true if  it is an even number, otherwise return false.
            2. Modify the while code. Make it also record the total number of ten numbers it has found and break once
            5 are found. At the end, display the total number of even numbers found.
------------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        int count =1;

        while(count !=6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for(int i=1; i<7; i++)
            System.out.println("Count value is " + i);

        count = 1;
        while(true)
        {
            if(count == 5)
                break;
            System.out.println("Count value is " + count);
            count++;
        }
        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
        }while(count != 6);

        int number = 4;
        int finishNumber =20;
        int count2 =0;

        System.out.println(isEvenNumber(number));
        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
                continue;
            count2 ++;

            System.out.println("Even number: " + number);

            if(count2 ==5)
                break;

        }
        System.out.println("Total even numbers found: " + count2);

    }
    //Challenge

    public static boolean isEvenNumber( int number)
    {
        return number%2 ==0;
    }
}
