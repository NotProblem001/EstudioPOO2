package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon sword1 = new Weapon("Sword", 10,100);
        Potion healthPotion1 = new Potion("Health Potion", 5, 20);
        Inventory inventory1 = new Inventory();
        
        sword1.Use();
        sword1.Use(10);
        healthPotion1.Use();
        
        inventory1.addItem(sword1);
    }
}