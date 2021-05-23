/*
main.java
-----------------------------------------------------------------------------------------------------------------------
Created by Eld@e@
-----------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
              The method should not return any value (void)
           2. Using a switch statement print "Sunday", "Monday",..., "Saturday" if the int parameter "day" is 0, 1,...6
              respectively, otherwise should print "Invalid day".
           Bonus: 1. Write a second solution using i  f then else, instead of using switch.
------------------------------------------------------------------------------------------------------------------------
Created on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 23/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek2(0);
        printDayOfTheWeek2(1);
        printDayOfTheWeek2(2);
        printDayOfTheWeek2(3);
        printDayOfTheWeek2(4);
        printDayOfTheWeek2(5);
        printDayOfTheWeek2(6);
        printDayOfTheWeek2(7);

    }
    public static void printDayOfTheWeek(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }


    }
    public static void printDayOfTheWeek2(int day)
    {

        if(day == 0)
            System.out.println("Sunday");
        else if(day ==1)
            System.out.println("Monday");
        else if(day ==2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wednesday");
        else if(day == 4)
            System.out.println("Thursday");
        else if(day == 5)
            System.out.println("Friday");
        else if(day ==6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid day");

    }
}
