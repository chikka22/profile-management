package com.sample;

/**
 * Created by vgandsa on 12/21/15.
 */
public class Ostrich extends Animal {
    String name;


    public Ostrich(String name, String color, Integer legs, Integer height, Integer weight) {
        super(color,legs,height,weight);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ostrich)) return false;

        Ostrich ostrich = (Ostrich) o;

        return getName().equals(ostrich.getName());

    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return "Ostrich{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
