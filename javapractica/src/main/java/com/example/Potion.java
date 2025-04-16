package com.example;

public class Potion extends Item implements Consumible {
    private int healing;

    public Potion(String name, int value, int healing) {
        super(name, value);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

    @Override
    public void Consume() {
        System.out.println("Consuming potion: " + getName() + " with healing: " + healing);
    }

    @Override
    public void Use() {
        System.out.println("Using potion: " + getName()  + " with healing: " + healing);
    }

}
