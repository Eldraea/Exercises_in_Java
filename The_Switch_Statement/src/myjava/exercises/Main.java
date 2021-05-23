/*
main.java
-----------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
-----------------------------------------------------------------------------------------------------------------------
Introduction to the switch statement
Challenge: Create a new switch statement using char instead of a int
           Create a new char variable
           Create a switch statement testing for A,B,C,D or E
           Display a message if any of these are found and then break
           Add a default which displays a message saying not found.
-----------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------

 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //Without a switch
        int value = 1;
         if (value == 1)
             System.out.println("Value was 1 ");
         else if(value ==2)
             System.out.println("Value was 2");
         else
             System.out.println("Was not 1 or 2");

         //With a switch : good to use if you want to test different values for a variable
         int switchValue =3;
         switch(switchValue)
         {
             case 1:
                 System.out.println("Value was 1");
                 break;
             case 2:
                 System.out.println("Value was 2");
                 break;
             case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a five");
                System.out.println("Actually it is a " + switchValue);
                break;
             default:
                 System.out.println("Was not 1, 2, 3, 4 or 5");
                 break;
         }

         //Challenge
        char newSwitchValue ='C';
         switch(newSwitchValue){
             case 'A':
                 System.out.println("We found a A!");
                 break;
             case 'B':
                 System.out.println("We found a B!");
                 break;
             case 'C':
                 System.out.println("We found a C!");
                 break;
             case 'D':
                 System.out.println("We found a D!");
                 break;
             case 'E':
                 System.out.println("We found a E!");
                 break;
             default:
                 System.out.println("We didn't found any of these letters");
                 break;
         }

    }
}
