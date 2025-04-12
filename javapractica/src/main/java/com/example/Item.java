package com.example;

public class Item {

    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    
    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        if (value < 0) {
        this.value = value;
        }
        else {
            System.out.println("Value cannot be negative.");
        }
    }

    

}
