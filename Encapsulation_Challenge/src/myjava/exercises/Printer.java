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
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel < 0 || tonerLevel > 100)
            this.tonerLevel = -1;
        else
            this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100)
            return -1;
        else if (this.tonerLevel + tonerAmount > 100)
            return -1;
        else
            return this.tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        int pagesToPrint = 0;
        if (pages < 0)
            return -1;
        else if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages / 2 + pages %2;
        }
        else
            pagesToPrint = pages;
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;

    }

        public int getPagesPrinted(){
            return pagesPrinted;
        }
    }

