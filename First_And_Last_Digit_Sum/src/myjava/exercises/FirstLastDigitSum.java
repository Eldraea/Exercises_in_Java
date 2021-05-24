/*
FirstLastDigitSum.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named sumFirstAndLastDigit with one parameter of type int called number.
              The methods needs to find the fist and the last digit of the parameter number passed the method, using a
              loop and return the sum of the first and the last digit of that number.
              If the number is negative then the method needs to return -1 to indicate an invalid value.
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number)
    {
        int lastDigit = number %10;
        int count = 0;

        if(number < 0)
            return -1;
        do {

            count++;
            if(count == 1 && number/10 == 0){
                break;
            }
            number = number /10;

        }while(number/10 !=0);
      return  number+ lastDigit;
    }
}
