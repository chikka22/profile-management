package com.sample;

/**
 * Created by vgandsa on 12/21/15.
 */
public class Dog extends Animal {
    String name;

    public Dog(String name, String color, Integer legs, Integer height, Integer weight) {
        super(color,legs,height,weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        boolean equal= !(getName() != null ? !getName().equals(dog.getName()) : dog.getName() != null);
       return equal && super.equals(o);

    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}
