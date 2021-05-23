/*
main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method with name sumDigits that has one int parameter called number
              If parameter is >=10, then the method should process the number and return sum of all digits, otherwise
              return -1 to indicate an invalid value.
              The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative
              numbers, so also return -1 for negative numbers.
              For example, calling the method sumDigits(125) should return 8 since 1+2+5 = 8
              Calling the method sumDigits(1) should return -1 as per requirements described above.
------------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */
package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number)
    {
        int sum = 0;
        if(number <10)
            return -1;

        while(number%10 != 0)
        {
            sum = sum + number%10;
            number = number /10;

        }
        return sum;


    }
}
