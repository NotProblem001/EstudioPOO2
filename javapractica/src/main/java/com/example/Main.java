package com.example;

public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("Scythe", 30,50);
        Weapon weapon2 = new Weapon("Blood Sword", 100,150);
        Potion healthPotion1 = new Potion("Health Potion", 5, 20);

        Inventory inventory1 = new Inventory();
        
        System.out.println("*------------------*");
        weapon2.Use();
        weapon1.Use(10);
        healthPotion1.Use();
        weapon2.Equip();

        System.out.println("------------------");
        inventory1.addItem(weapon1);
        inventory1.addItem(healthPotion1);
        inventory1.addItem(weapon2);

        inventory1.UseItem(0);
        inventory1.UseItem(1);

        inventory1.showInventory();
        inventory1.getItemCount();

        System.out.println("------------------");
    }
}