/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge:    Modify the previous HeavenlyBody example so that the HeavenlyBody class also has a "bodyType" field. This
              field will store the type of HeavenlyBody(PLANET, DWARF_PLANET, MOON).
              For each of the three types tha tis supported subclass the HeavenlyBody class so that your program can
              create objects of the appropriate type.
              There is a restriction that only satellites that planets can have must be moons.

              1. HeavenlyBody (abstract class)
                - It has three private final fields.
                  * A Key called key
                  * a double called orbitalPeriod
                  * a Set of type HeavenlyBody called satellites.
                - A constructor that takes a String (name of the HeavenlyBody), a double (its orbital period) and a
                  BodyType. key is initialized with a new Key object and satellites is initialized with a new HashSet.
                - Eight methods:
                  * getOrbitalPeriod(), getter for orbitalPeriod
                  * getKey(), getter for key
                  * addSatellite(), it takes a heavenlyBody as a parameter and returns true if it was added successfully
                    false otherwise.
                  * getSatellites(), returns a new HashSet populated with satellites.
                  * equals(), override method declared as public final. Two HeavenlyBody objects are equal if their keys
                    are equal.
                  * hashCode(), override method declared as public final. Return the hash code of key.
                  * makeKey(), declared as public static and returns a new Key object.
                  * toString(), override method. Return the string representation as : "name : bodyType, orbitalPeriod"

              2. BodyTypes(nested enum)
                 - It has three constants: PLANET - DWARF_PLANET - MOON
              3. Key(nested class)
                 - It has two fields:
                    * A String called name
                    * A BodyTypes called bodyType
                 - A constructor declared as private that takes a String and a BodyTypes and initializes the fields with
                   it.
                 - And five methods:
                   * getName(), getter for name
                   * getBodyType(), getter for bodyType
                   * equals(), override method. Two Key objects are equal if they have the same name and bodyType
                   * hashCode(), override method. Return the hash code for name, plus hash code for bodyType, plus an
                     arbitrary number (random)
                   * toString(), override method. Return the string representation as: "name: bodyType"
               4. Planet
                  - A constructor that takes a String(name of the planet) and a double (its orbital period)
                  - And one method:
                    * addSatellite(), override method. Add the satellite if its body type is a moon.
               5. DwarfPlanet
                  - A constructor that takes a String(name of the Moon) and a double(its orbital period) and calls
                    its parent class with its arguments
------------------------------------------------------------------------------------------------------------------------
Created on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final Set<HeavenlyBody> solarSystem = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.add(temp);
        temp = new Planet("Venus",225);
        solarSystem.add(temp);
        temp = new Planet("Earth", 365);
        solarSystem.add(temp);
        HeavenlyBody moon = new Moon("Moon", 28);
        temp.addSatellites(moon);
        temp = new Planet("Mars", 687);
        solarSystem.add(temp);
        moon = new Moon("Phobos", 365);
        temp.addSatellites(moon);
        moon = new Moon("Deimos", 58);
        temp.addSatellites(moon);
        temp = new Planet("Jupiter", 4332);
        solarSystem.add(temp);
        temp = new Planet("Saturn", 10759);
        solarSystem.add(temp);
        temp = new Planet("Uranus", 30660);
        solarSystem.add(temp);
        temp = new Planet("Neptune", 165);
        solarSystem.add(temp);
        temp = new DwarfPlanet("Pluto", 842);
        solarSystem.add(temp);
        temp = new DwarfPlanet("Pluto", 248);
        solarSystem.add(temp);

       printSet(solarSystem);
    }

    public static void printSet(Set<HeavenlyBody> set)
    {
        for(HeavenlyBody s: set)
        {
            System.out.println(s.toString());
            for(HeavenlyBody satellite : s.getSatellites())
            {
                System.out.println(satellite.toString());
            }
        }
    }





}
