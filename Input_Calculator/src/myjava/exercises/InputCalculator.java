/*
InputCalculator.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method called inputThenPrintSumAndAverage that does not have any parameter.
              The method should not return anything(void) and it needs to keep reading int numbers from the keyboard.
              When the user enters something that is not an int then it needs to print a message in the format
              "SUM = XX AVG =YY"
                    XX represents the sum of all entered numbers of type int
                    YY represents the average of all numbers of type long

------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count =0;
        int number;

        while(true)
        {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
               number= scanner.nextInt();
                sum = sum + number;
                count++;
            }
            else
            {
                break;
            }
            scanner.nextLine();
        }
        if(count ==0)
            System.out.println("SUM = "+ sum + " AVERAGE = " + sum);
        else if((sum+1)/count >0)
            System.out.println("SUM = "+ sum + " AVERAGE = " + Math.round((double) (sum)/count));
        else if((sum+1)/count <0)
            System.out.println("SUM = "+ sum + " AVERAGE = " + (int)Math.floor((sum)/count));

        scanner.close();
    }
}
