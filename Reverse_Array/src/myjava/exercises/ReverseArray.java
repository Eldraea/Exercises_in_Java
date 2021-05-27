/*
ReverseArray.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method called reverse() with int array as parameter.
              The method should not return any value. In other words, the method is allowed to modify the array
              parameter.
              To reverse the array, you have to swap the elements, so that first element is swapped with the last
              element and so on.
------------------------------------------------------------------------------------------------------------------------
Create on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 27/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class ReverseArray {

    public static void reverse(int[] array)
    {

        System.out.print("Array = [");
        for(int i = 0; i < array.length -1; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length -1] + "]");


            for(int i = 1; i <= (array.length/2);i++)
            {
                int temp = array[i-1];
                array[i-1] = array[array.length-i];
                array[array.length - i] = temp;
            }


        System.out.println();
        System.out.print("Reversed array = [");
        for(int i = 0; i < array.length -1; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length -1] + "]");
    }

}
