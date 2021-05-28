/*
Monster.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Monster class
------------------------------------------------------------------------------------------------------------------------
Created  on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.ArrayList;
import java.util.List;


public class Monster implements ISaveable{

        private String name;
        private int hitPoints;
        private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {

        List<String> myList = new ArrayList<String>();
        myList.add(0, this.getName());
        myList.add(1, "" + getHitPoints());
        myList.add(2, "" + this.getStrength());


        return myList ;
    }

    @Override
    public void read(List<String> aList) {


        if(aList!=null && aList.size()>0 )

        {
            this.name = aList.get(0);
            this.hitPoints = Integer.parseInt(aList.get(1));
            this.strength = Integer.parseInt(aList.get(2));
        }
    }


    @Override
    public String toString()
    {

        return "Player{name='" + this.getName()+ "', hitPoints=" + this.getHitPoints()+ ", strength=" +
                this.getStrength() +"'}";

    }

}
