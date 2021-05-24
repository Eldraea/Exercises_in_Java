/*
EvenDigitSum.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named getEvenDigitSum with one parameter of type int called number.
            The method should return the sum of the even digits within the number.
            If the number is negative, the method should return -1 to indicate an invalid value.
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number)
    {
         int lastDigit = 0;
         int count =0;

        if(number < 0)
            return -1;

        do {
            count++;
            if(count ==1 && number/10 == 0) {
                lastDigit = number;
                break;
            }

            if((number%10)%2 == 0 && number/10 ==0) {
                lastDigit = lastDigit + number % 10;
                number = number/10;

            }
            if((number%10)%2 == 0 && number/10 !=0) {
                lastDigit = lastDigit + number % 10;
                number = number/10;
            }
            else if((number%10)%2 == 1 && number/10!=0)
            {
                number= number/10;
            }
            else{
                break;
            }

        }while(number>0 || number/10 !=0 );

        return lastDigit;
    }
}
