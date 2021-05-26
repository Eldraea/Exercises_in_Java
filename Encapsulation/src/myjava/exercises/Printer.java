/*
Printer.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Printer class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {

        if(tonerLevel < 0 || tonerLevel >100)
            this.tonerLevel = -1;
        else
            this.tonerLevel = tonerLevel;

        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public Printer(boolean isDuplexPrinter) {
        this.tonerLevel = 100;
        this.numberOfPagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel < 0 || tonerLevel >100)
            this.tonerLevel = -1;
        else
            this.tonerLevel = tonerLevel;

        this.isDuplexPrinter = isDuplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public void fillUpTheToner(int quantity)
    {
        if((this.tonerLevel + quantity)> 100)
            this.tonerLevel = 100;
        else if(this.tonerLevel + quantity < 0)
            this.tonerLevel = -1;
        else
            this.tonerLevel += quantity;

    }

    public void printAPage(int pages)
    {
        if(this.isDuplexPrinter)
            numberOfPagesPrinted = numberOfPagesPrinted+ pages * 2;
        else if(pages <0)
            numberOfPagesPrinted = numberOfPagesPrinted;
        else
            numberOfPagesPrinted = numberOfPagesPrinted + pages;

    }

    public int getNumberOfPagesPrinted() {

        return numberOfPagesPrinted;
    }
}
