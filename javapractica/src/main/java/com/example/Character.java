package com.example;

public class Character extends Inventory{
    private String name;
    private int health;

    public Character(String name, int health,int limit) {
        super(limit);
        this.name = name;
        this.health = health;
        
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0; // Health cannot be negative
        } else {
            this.health = health;
        }
    }

}