/*
DwarfPlanet.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The DwarfPlanet class
------------------------------------------------------------------------------------------------------------------------
Created on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class DwarfPlanet extends HeavenlyBody{

    public DwarfPlanet(String nameOfTheHeavenlyBody, double orbitalPeriod) {
        super(nameOfTheHeavenlyBody, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}