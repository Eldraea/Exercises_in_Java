/*
FlourPacker.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: 1. Write a method named canPack with three parameters of type int named, bigCount, smallCount, and goal.
              The parameter bigCount represents the count of big flour bags(5 kilos each)
              The parameter smallCount represents the count of small flour bags(1 kilo each)
              The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
              Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
              The method should return true if it is possible to make a package with goal kilos of flour.
              If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example,
              if goal = 9, bigCount = 2, and smallCount =0n the method should return false since each bug bag is 5 kilos
              and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return
              true because 1 full bigCount and 4 full smallCount bags equal goal, and it's okay if there additional bags
              left over.
              If any of the parameter are negative, return false
------------------------------------------------------------------------------------------------------------------------
Created on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 24/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else if (bigCount * 5 + smallCount < goal)
            return false;
        else if (bigCount == 0)
            return (smallCount >= goal);
        else if (smallCount == 0)
            return (bigCount * 5 >= goal && goal % 5 == 0);

        else {
            for (int i = 0; i < bigCount; i++) {
                if(goal - 5 >= 0)
                    goal = goal - 5;
                else
                    break;
            }
            if (goal > smallCount)
                return false;
            else
                return true;
        }
    }
}
