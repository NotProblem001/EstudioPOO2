package com.example;

public class Weapon extends Item{
    private int damage;
    
    public Weapon(String name, int value, int damage) {
        super(name, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void Use() {
        System.out.println("Using weapon: " + getName()  + " with damage: " + damage);
    }

    public void Use(int bonus){
        System.out.println("Using weapon: " + getName()  + " with damage: " + (damage + bonus));
    }
}
