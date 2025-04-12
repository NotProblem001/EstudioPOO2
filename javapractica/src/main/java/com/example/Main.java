package com.example;

public class Main {
    public static void main(String[] args) {
        Weapon sword1 = new Weapon("Sword", 10,100);
        Potion healthPotion1 = new Potion("Health Potion", 5, 20);
        Inventory inventory1 = new Inventory();
        
        System.out.println("------------------");
        sword1.Use();
        sword1.Use(10);
        healthPotion1.Use();
        sword1.Equip();

        System.out.println("------------------");
        inventory1.addItem(sword1);
        inventory1.addItem(healthPotion1);
        inventory1.UserItem(0);
        inventory1.UserItem(1);

        inventory1.showInventory();

        System.out.println("------------------");
    }
}