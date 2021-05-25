/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with name
              firstNumber and secondNumber both of type double.
              Write the following methods (instance methods):
                 - Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field
                 - Method named getSecondNumber without any parameters, it needs to return the value of secondNumber
                   field.
                 - Method named setFirstNumber with one parameter of type double, it needs to return the value of
                   firstNumber field.
                 - Method named setSecondNumber with one parameter of type double, it needs to set the value of the
                   secondNumber field.
                 - Method named getAdditionResult without any parameters, it needs to return the result of adding the
                   fields values of firstNumber and secondNumber;
                 - Method named getMultiplicationResult without any parameters, it needs to return the result of
                   multiplying the field values of firstNumber and secondNumber.
                 - Method named getDivisionResult without any parameters, it needs to return the result of dividing the
                   field values of firstNumber by the secondNumber. In case of the value of secondNumber is 0 then
                   return 0;
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
