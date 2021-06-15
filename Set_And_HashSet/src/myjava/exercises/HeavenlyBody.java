/*
HeavenlyBody.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The HeavenlyBody class
------------------------------------------------------------------------------------------------------------------------
Created on 11/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 11/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;




    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();


    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon)
    {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println("obj.getClass() is " + o.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if (o == null || getClass() != o.getClass()) return false;
        String objectName = ((HeavenlyBody) o).getName();
        return this.name.equals(objectName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
}
