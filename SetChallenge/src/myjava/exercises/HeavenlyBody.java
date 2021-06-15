/*
HeavenlyBody.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The HeavenlyBody class
------------------------------------------------------------------------------------------------------------------------
Created on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 15/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String nameOfTheHeavenlyBody, double orbitalPeriod, BodyTypes bodyType) {
        this.key = makeKey(nameOfTheHeavenlyBody, bodyType);
        this.satellites = new HashSet<>();
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellites(HeavenlyBody satellite)
    {
      return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return satellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody obj = (HeavenlyBody) o;
        return Objects.equals(key, obj.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    public static Key makeKey(String nameOfTheHeavenlyBody, BodyTypes bodyType)
    {
        return new Key(nameOfTheHeavenlyBody, bodyType);
    }

    @Override
    public String toString() {


        return  this.getKey().getName() + ": " + this.getKey().getBodyType() + ", " + this.getOrbitalPeriod() ;
    }
    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }
    public static final class Key{

        private final String name;
        BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(name, key.name) &&
                    bodyType == key.bodyType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name) + Objects.hash(this.bodyType) + 57;
        }

        @Override
        public String toString() {
            return this.getName() + ": " + this.getBodyType();
        }
    }
}
