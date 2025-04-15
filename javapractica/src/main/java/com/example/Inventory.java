package com.example;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private int limit;

    public Inventory(int limit) {
        items = new ArrayList<Item>();
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item: " + item.getName() + " to inventory.");
        if (items.size() > limit) {
            System.out.println("Inventory limit exceeded. Cannot add more items.");
            items.remove(item); // Remove the item if limit is exceeded
        } else {
            System.out.println("Item added successfully. Current inventory slot: " + items.size());
        }
    }

    public void removeItem(int index) {
        if(index >= 0 && index < items.size()){
            Item removedItem = items.remove(index);
            System.out.println("Removed item: " + removedItem.getName() + " from inventory.");
        } else {
            System.out.println("Invalid index. Cannot remove item.");
        }
    }

    public void UseItem(int index) {
        if(index >= 0 && index < items.size()){
            items.get(index).Use();
        } else {
            System.out.println("Invalid index. Cannot use item.");
        }
    }
    
    public void showInventory() {
        System.out.println("Inventory : ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item " + i + ": " + items.get(i).getName());
        }
    }
    
    public int getItemCount() {
        System.out.println("Total items in inventory: " + items.size());
        return items.size(); 
    }
}
