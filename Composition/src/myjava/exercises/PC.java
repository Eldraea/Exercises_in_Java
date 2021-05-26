/*
PC.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The PC class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;


    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo()
    {
        //Fancy graphics

        monitor.drawPixelAt(1200,50, "purple");
    }

}
