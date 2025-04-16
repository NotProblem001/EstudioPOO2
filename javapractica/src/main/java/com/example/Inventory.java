package com.example;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private int capacityLimit;
    private int actualCapacity;

    public Inventory(int capacityLimit) {
        items = new ArrayList<Item>();
        this.capacityLimit = capacityLimit;
        this.actualCapacity = 0;
    }

    public int getCapacityLimit() {
        return capacityLimit;
    }

    public void setCapacityLimit(int limit){
        if(capacityLimit > 0){
            this.capacityLimit = limit;
        } else {
            System.out.println("Capacity limit must be greater than 0.");
        }
    }

    public void addItem(Item item) {
        if(actualCapacity < capacityLimit){
            items.add(item);
            actualCapacity ++;
            System.out.println("Added item :" + item.getName());
            System.out.println("Your actual capacity is :" + actualCapacity + " of " + capacityLimit);
        }else{
            System.out.println("You have no more space remaining in your inventory");
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

    public ArrayList<Item> getItems(){
        return items;
    }
}
