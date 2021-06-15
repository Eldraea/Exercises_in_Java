/*
Planet.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Planet class
------------------------------------------------------------------------------------------------------------------------
Created on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class Planet extends HeavenlyBody{

    public Planet(String nameOfTheHeavenlyBody, double orbitalPeriod) {
        super(nameOfTheHeavenlyBody, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        if(satellite.getKey().getBodyType() == BodyTypes.MOON)
            return super.addSatellites(satellite);
        return false;
    }
}
