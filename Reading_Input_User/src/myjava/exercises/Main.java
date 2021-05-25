/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to the reading of user inputs
Challenge: 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
              Before the user enters each number, print the message "Enter number #x:" where x represents the count.
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt= scanner.hasNextInt();
      


        if(hasNextInt){
            int date = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name:");
            String name=scanner.nextLine();

            int age = 2021 - date;
            if( age>=0 && age <=100)
                System.out.println("Your name is " +name +" and you are " + age +" years old");
            else
                System.out.println("Invalid year of Birth");
        }
        else {
            System.out.println("Invalid Value");
        }


        //Challenge
        int sum = 0;
        boolean hasNextInt2 = false;
        for(int i =1; i <=10; i++)
        {
            System.out.println("Enter number #" + i);
           hasNextInt2 = scanner.hasNextInt();
            if(hasNextInt2)
            {
                sum = sum + scanner.nextInt();
            }
            else{
                System.out.println("Invalid Number");
                i = i-1;
            }
            scanner.nextLine();
        }
            System.out.println("The sum of all your numbers is equal to : "  + sum);

        scanner.close();
    }
}
