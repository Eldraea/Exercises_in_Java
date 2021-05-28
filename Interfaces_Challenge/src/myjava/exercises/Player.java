/*
Player.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Player class
------------------------------------------------------------------------------------------------------------------------
Created  on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.*;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon ="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {

        List<String> myList = new ArrayList<String>();
        myList.add(0, this.getName());
        myList.add(1, "" + getHitPoints());
        myList.add(2, "" + this.getStrength());
        myList.add(3, this.getWeapon());



        return myList ;
    }

    @Override
    public void read(List<String> aList) {


        if(aList!=null && aList.size()>0 )

        {
           this.name = aList.get(0);
           this.hitPoints = Integer.parseInt(aList.get(1));
           this.strength = Integer.parseInt(aList.get(2));
           this.weapon = aList.get(3);
        }
    }

    @Override
    public String toString()
    {
        return "Player{name='" + this.getName()+ "', hitPoints=" + this.getHitPoints()+ ", strength=" +this.getStrength()
        + ", weapon='" + this.getWeapon() +"'}";
    }
}
