/*
main.java
-------------------------------------------------
Created by Eld@e@
-------------------------------------------------
Introduction to Operator, Operands and Expressions
--------------------------------------------------
Created on: 21/05/2021
--------------------------------------------------
Last Update on : 21/05/2021
--------------------------------------------------
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

    }
}
