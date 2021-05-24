/*
SharedDigit.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named hasSharedDigit with two parameters of type int.
              Each number should be within the range of 10(inclusive) - 99 (inclusive). If one of the numbers is not
              within the range, the method should return false.
              The method should return true if there is a digit that appears in both numbers, such as 2 iin 12 and 23;
              otherwise, the method should return false.
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
-----

 */

package myjava.exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2)
    {

        boolean areSharingDigit = false;

        if(number1 < 10 || number2 <10 || number1> 99 || number2 >99)
            return false;

        for(int i=0; i <10; i++) {
          if((number1%10)==i && number2%10==i) {
              areSharingDigit = true;
              break;
          }
          else if(number1/10 ==i && number2/10==i){
              areSharingDigit = true;
              break;
          }
          else if(number1%10 ==i && number2/10==i){
              areSharingDigit = true;
              break;
          }

          else if(number1/10==i && number2%10==i) {
              areSharingDigit = true;
              break;
          }
          else
              areSharingDigit = false;

        }
        return areSharingDigit;

    }
}
