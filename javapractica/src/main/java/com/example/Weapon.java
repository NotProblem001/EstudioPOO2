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



}
