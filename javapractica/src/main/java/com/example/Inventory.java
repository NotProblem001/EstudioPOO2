package com.example;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item: " + item.getName() + " to inventory.");
    }

    public void UserItem(int index) {
        if(index >= 0 && index < items.size()){
            items.get(index).Use();
        } else {
            System.out.println("Invalid index. Cannot use item.");
        }
    }
}
