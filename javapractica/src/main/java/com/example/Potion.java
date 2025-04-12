package com.example;

public class Potion extends Item{
    private int healing;

    public Potion(String name, int value, int healing) {
        super(name, value);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

    @Override
    public void Use() {
        System.out.println("Using potion: " + getName()  + " with healing: " + healing);
    }

    public void Use(int bonus){
        System.out.println("Using potion: " + getName()  + " with healing: " + (healing + bonus));
    }

}
