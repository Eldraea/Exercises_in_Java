/*
MinimumElement.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method called readIntegers() with a parameter called count that represents how many integers the
              user needs to enter.
              The method needs to read from the console until all the numbers are entered, and then return an array
              containing the numbers entered.
              Write a method findMin() with the array as parameter.The method needs to return the minimum value in the
              array.
              In the main() method read the count from the console and call the method readIntegers() with the count
              parameter.
------------------------------------------------------------------------------------------------------------------------
Create on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int[] readIntegers(int count)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i =1 ; i <=count; i++)
        {
            System.out.println("Entrez le nombre #" +i +":" );
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
                array[i-1] = scanner.nextInt();
            else
                i--;
            scanner.nextLine();
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array)
    {
        Arrays.sort(array);

        return array[0];
    }

}
