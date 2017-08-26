package com.zoo.infrastructure;

import com.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Animal> animals;

    public Building(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setBuilding(this);
        System.out.println("animal added to building " + animal.toString() + " name: " + name);
    }


    private String name;

    public String getName() {
        return name;
    }

    public String getAnimalTypes() {
        String result = "";
        for (Animal animal : animals) {
            result = result + animal.getClass().getCanonicalName() + "\n";
        }
        return result;
    }

    public Integer getAnimalCount() {
        return animals.size();
    }

    public String getAnimalsNames() {
        return animals.toString();
    }


}
