/*
NumberToWords.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method called numberToWords with one int parameter named number.
              The method should print out the passed number using words for the digits.
              If the number is negative, print "Invalid Value".
              To print the number as words, follow these steps:
                1. Extract the last digit of the given number using the remainder operator
                2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that
                   digit, those being 0,1,2,3,4,5,6,7,8,9. Print the corresponding word for each digit.
                3. Remove the last digit from the number
                4. Repeat Steps 2 through 4 until the number is 0
              The logic above is correct, but in the current state, the words will be printed in reverse order. For
              example, if the number is 234, the logic above will produce the output "Four Three Two", instead of "Two
              Three Four". To overcome this problem, write a second method called reverse.
              The method reverse should have one int parameter and return the reversed number (int). For example, if the
              number passed if 234, then the reversed number would be 432. The method reverse should also reverse
              negative numbers.
           2. Use the method reverse within the method numberToWords in order to print the words in the correct order.
              Another thing to keep in mind is any reversed number with leading zeroes ( example: the reversed number for
              100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should
              print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
           3. The method getDigitCount should have one int parameter called number and return the count of the digits in
              that number. If the number is negative, return -1 to indicate an invalid value.
              For example, if the number has a value of 100, the method getDigitCount should return 3 since the number
              has 3 digits(1,0,0)

------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

public class NumberToWords {

    public static void numberToWords(int number)
    {
       if(number <0)
           System.out.println("Invalid Value");
       else{
           int newNumber= reverse(number);
           int result;
           for(int i =1; i <= getDigitsCount(number); i++)
           {
               result= newNumber%10;

               switch(result)
                   {
                       case 0:
                           System.out.println("Zero");
                           break;
                       case 1:
                           System.out.println("One");
                           break;
                       case 2:
                           System.out.println("Two");
                           break;
                       case 3:
                           System.out.println("Three");
                           break;
                       case 4:
                           System.out.println("Four");
                           break;
                       case 5:
                           System.out.println("Five");
                           break;
                       case 6:
                           System.out.println("Six");
                           break;
                       case 7:
                           System.out.println("Seven");
                           break;
                       case 8:
                           System.out.println("Eight");
                           break;
                       case 9:
                           System.out.println("Nine");
                           break;
                       default:
                           System.out.println("Invalid Value");
                           break;

                   }
               newNumber= newNumber /10;
           }
       }

    }

    public static int reverse(int number)
    {

        int newNumber = 0;

        do {
            newNumber = newNumber *10;
            newNumber= (newNumber +number%10);
            number = number /10;

        }while(number!=0);

        return newNumber;
    }

    public static int getDigitsCount(int number)
    {
        if(number <0)
            return -1;

        int count = 0;
        do {
            count++;
            number= number/10;

        }while(number!=0);

        return count;
    }
}
