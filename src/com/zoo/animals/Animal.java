package com.zoo.animals;

public class Animal {
    private String color;
    private Integer legCount;
    private Integer weight;
    private String name;
    private Integer hungerLevel;

    public Animal() {
        hungerLevel = 50;
        name = "unnamed animal";
        //System.out.println("Hellou from Animal() coustructor");
    }

    public Animal(String name, Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
        this.name = name;
        //System.out.println("hello from Animal(hungerLevel) constructor");
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + ": I'm Animal";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegCount() {
        return legCount;
    }

    public void setLegCount(Integer legCount) {
        this.legCount = legCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public void move() {
        if (hungerLevel < 100) {
            hungerLevel += 10;
            System.out.println("I'm animal - I'm moving");
        } else {
            System.out.println("I'm exhausted and starving!!! I can't move");
        }
    }

    public void makeSound() {

        if (hungerLevel < 100) {
            System.out.println("I'm making some noise");
            hungerLevel += 1;
        } else {
            System.out.println("I'm exhausted and starving!!! I can't make noise");

        }
    }

    public void feed() {
        System.out.println("I'm animal - I'm eating");
        if (hungerLevel > 0) {
            hungerLevel = hungerLevel - 1;
        } else System.out.println(" I dont't need any more food");
    }
}
