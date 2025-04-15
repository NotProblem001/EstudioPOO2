package com.example;

public class Tools extends Item{
    private String type;
    private int durability;

    public Tools(String name, int value, String type, int durability) {
        super(name, value);
        this.type = type;
        this.durability = durability;
    }

    public String getType() {
        return type;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public void Use() {
        System.out.println("Using tool: " + getName() + " of type: " + type + " with durability: " + durability);
    }

}