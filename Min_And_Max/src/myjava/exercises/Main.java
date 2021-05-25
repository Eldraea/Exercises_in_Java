/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Read the numbers from the console entered by the user and print the minimum and maximum number the user
              has entered.
              Before the user enters the number, print the message "Enter number:"
              If the user enters an invalid number, break out of the loop and print the minimum and the maximum number.
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

        Scanner scanner= new Scanner(System.in);

        boolean firstValueGood = false;
        int maximum = 0;
        int minimum = 0;
        int number ;
        System.out.println("Enter a number:");
        boolean isAnInt = scanner.hasNextInt();
        if (isAnInt) {
            number= scanner.nextInt();
            maximum = number;
            minimum = number;
            firstValueGood =true;

        }
        else
        {
            System.out.println("Invalid value");
        }
        while(firstValueGood)
        {
            System.out.println("Enter a number:");
            boolean isAnInt2 = scanner.hasNextInt();
            if(isAnInt2){

                number = scanner.nextInt();
                if(number> maximum)
                    maximum = number;
                else if(number < minimum)
                    minimum = number;
            }
            else
            {
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();
        }
        if(firstValueGood) {
            System.out.println("The minimum you entered is: " + minimum);
            System.out.println("The maximum you entered is: " + maximum);

        }
        else
            System.out.println("Sorry. You've entered an invalid value from the start");
        scanner.close();
    }
}
