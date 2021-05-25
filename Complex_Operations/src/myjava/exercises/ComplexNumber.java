/*
ComplexNumber.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The ComputerNumber class
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber number)
    {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void add(double real, double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(double real, double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number)
    {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }

}
