/*
SumOdd.java
-----------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1.Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean
           2. Check that number is >0, if it is not return false.
           If the number is odd return true, otherwise return false.
           3.Write a second called sumOdd that has 2 int parameters start and end which represent a range of numbers
             The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
             It should call the method isOdd to check if each number is odd.
             The parameter end needs to be greater than or equal to start and both start and end parameters have to be
             greater than 0.
             If those conditions are not satisfied return -1 from the method to indicate invalid input.
------------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class SumOdd {

    public static boolean isOdd(int number)
    {
       if(number <= 0)
           return false;
        else return number % 2 == 1;
    }

    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(start <0 || end < 0 || start > end)
            return -1;

        for(int i = start; i <= end; i++)
        {
            if(isOdd(i))
                sum = sum + i;
        }
        return sum;
    }
}
