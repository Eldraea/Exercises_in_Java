/*
SortedArray.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The SortedArray class
------------------------------------------------------------------------------------------------------------------------
Create on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.Scanner;

public class SortedArray {

    public static int[] sortIntegers(int [] array)
    {
        int temp = 0;
        for(int i = 0; i< array.length; i++)
        {
            for(int j =0; j < array.length; j++)
            {
                if(array[i]> array[j])
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }
        return array;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];

        for(int i =1 ; i <=number; i++)
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
}
