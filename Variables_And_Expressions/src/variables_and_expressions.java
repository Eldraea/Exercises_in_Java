
/*
variables_and_expressions.java
-------------------------------
Created by Eldr@e@
--------------------------------
Challenge: Create additional variables
            Declare the following variables and add to our program
            mySecondNumber which is an int and assign a value of 12 to it
            myThirdNumber, also an int with a value of myFirstNumber multiplied by 2
            myTotal, also an int which is the addition of our variables
            Create then a new variable call myLastOne. We want the value to be 1000 less the current value of myTotal (data type is an int too)
            Remember we already have " int myFirstNumber = (10+5) + (2*10);"

 */
public class variables_and_expressions {

    public static void main(String[] args)
    {
        int myFirstNumber = (10 +5) + (2* 10), mySecondNumber = 12, myThirdNumber = myFirstNumber *2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myTotal);
        System.out.println(myLastOne);


    }
}
