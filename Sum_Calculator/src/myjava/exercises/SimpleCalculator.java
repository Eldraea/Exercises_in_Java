/*
SimpleCalculator.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The SimpleCalculator class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber= firstNumber;
    }

    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult()
    {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult()
    {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult()
    {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult()
    {
        if(this.secondNumber!=0)
            return this.firstNumber/ this.secondNumber;
        else
            return 0;
    }

}
