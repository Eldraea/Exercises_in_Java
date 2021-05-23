/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Create a for statement using a range of numbers from 1 to 1000 inclusive
           2. Sum all the numbers that can de divided with both 3 and also with 5
           3. For those numbers that met the above conditions, print out the number
           4. Break out of the loop once you find 5 numbers that met the above conditions
           5. After breaking out the loop, print the sum of the numbers that met above conditions
------------------------------------------------------------------------------------------------------------------------
Created on : 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        int count =0;
        int result =0;
        for(int i = 1; i <=1000; i++)
        {
            if((i%5 == 0) && (i%3 ==0))
            {
                count++;
                result = result +i;
                System.out.println(" Number " + i + " found" );
            }

            if(count == 5)
                break;
        }
        System.out.println(" The  result is: " + result );
    }
}
