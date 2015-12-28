package com.sample;

/**
 * Created by vgandsa on 12/21/15.
 */
public abstract class Animal {

    Integer legs;
    String color;
    Integer height;
    Integer weight;

    public Integer getLegs() {
        return legs;
    }
    public Animal(){}
    public Animal(String color, Integer legs, Integer height, Integer weight) {
        this.color = color;
        this.legs = legs;
        this.height = height;
        this.weight = weight;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        //super.equals(o);
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (!getLegs().equals(animal.getLegs())) return false;
        if (!getColor().equals(animal.getColor())) return false;
        if (getHeight() != null ? !getHeight().equals(animal.getHeight()) : animal.getHeight() != null) return false;
        return !(getWeight() != null ? !getWeight().equals(animal.getWeight()) : animal.getWeight() != null);

    }

    @Override
    public int hashCode() {
        int result = getLegs().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
