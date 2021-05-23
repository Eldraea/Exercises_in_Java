/*
main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to the for statement
Challenge:1. Using the for statement, call the calculateInterest method with the amount of 10000 with an interestRate of
           2,3,4,5,6,7, and 8 and print the result to the console window.
          2. Using the for statement, call the calculateInterest method with the amount of 10000 with an interestRate of
           8,7,6,5,4,3, and 2 and print the result to the console window.
          3. Create a for statement using any range numbers. Determine if the number is a prime number using the isPrime
           method. If it is a prime number, print it out AND increment a count of the number of prime numbers found.
           If that count is 3, exit the for loop.
           Hint: Use the break; statement to exit


------------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        System.out.println("10 000 at 2% interest = " + calculateInterest(10000,2.0));
        for(int i = 0; i <5; i++)
        {
            System.out.println("Loop " + i + " hello");
        }

        //Challenge
        for(int j= 2; j<9; j++)
        {

        }

        for(int i = 8; i >1; i--)
        {
            System.out.println(" The interest for an amount of 10000 and a interest rate of "+ i +
                    "% is equal to " + String.format("%.2f",calculateInterest(10000,i)));
        }
        int count = 0;
        for(int i = 0; i< 100; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Prime number found: " + i);
            }

            if(count == 3)
                break;
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return amount*(interestRate/100);
    }
    public static boolean isPrime(int number)
    {
        if(number == 1)
            return false;
        for(int i =2; i<= number/2; i++)
        {
            if(number%i == 0)
                return false;

        }

        return true;
    }
}
