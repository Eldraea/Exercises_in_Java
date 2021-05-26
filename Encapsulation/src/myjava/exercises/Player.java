/*
Player.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Player class
------------------------------------------------------------------------------------------------------------------------
Created on: 26/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on : 26/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;

        if(this.health <=0)
        {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
