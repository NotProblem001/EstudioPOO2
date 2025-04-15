package com.example;

public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("Scythe", 30,50);
        Weapon weapon2 = new Weapon("Blood Sword", 100,150);
        Potion healthPotion1 = new Potion("Health Potion", 5, 20);

        Inventory inventory1 = new Inventory(2);
        
        System.out.println("*----------*Objetos*----------*");
        weapon2.Equip();
        weapon2.Use();
        weapon1.Use(10);
        healthPotion1.Use();
        
        System.out.println("*----------*Inventario*----------*");
        
        System.out.println("~~~~ADD~~~~");
        inventory1.addItem(weapon1);
        inventory1.addItem(healthPotion1);
        inventory1.addItem(weapon2);
        
        System.out.println("~~~~USE~~~~");
        inventory1.UseItem(0);
        inventory1.UseItem(1);

        System.out.println("*----------*Personaje*----------*");
        Character character1 = new Character("EGGKing", 100, 2);
        System.out.println("Character Name: '" + character1.getName()+ "' Health: " + character1.getHealth());
        System.out.println("Character Inventory Limit: " + character1.getLimit());

        character1.addItem(weapon2);
        character1.addItem(weapon1);
        character1.addItem(healthPotion1);

        System.out.println("~~~~SHOW~~~~");        
        inventory1.showInventory();
        inventory1.getItemCount();
        
        character1.showInventory();
        character1.getItemCount();

        System.out.println("*----------*Fin*----------*");

    }
}