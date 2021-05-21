/*
main.java
---------------------------------------------
Created by Eldr@e@
---------------------------------------------
A programs that shows to abbreviate operators
----------------------------------------------
Created on: 21/05/2021
----------------------------------------------
Last Update on: 21/05/2021
----------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        //Addition
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult  = " + previousResult);

        //Subtraction
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        //Multiplication
        result = result *10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        //Division
        result = result /5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        //Remainder
        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        //Abbreviating result = result +1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //Abbreviating result = result - 1
        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //Abbreviating result = result +2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result  = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -=2;
        System.out.println("10 - 2 = " + result);



    }
}
