package com.example;

public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("Scythe", 30,50);
        Weapon weapon2 = new Weapon("Blood Sword", 100,150);
        Potion healthPotion1 = new Potion("Health Potion", 5, 20);
        Tools tool1 = new Tools("Iron Pickaxe", 10, "Mining", 50);
        
        
        Inventory inventory1 = new Inventory(2);
        Character character1 = new Character("EGGKing",100,inventory1);
        /*Character character2 = new Character("EGGQueen", 100, null);*/
        Npc npc1 = new Npc("aweonaito",50);
        
        System.out.println("*----------*Objetos*----------*");
        weapon2.Equip();
        weapon2.Use();
        weapon1.Use(10);
        healthPotion1.Use();
        
        System.out.println("*----------*Inventario*----------*");
        
        System.out.println("~~~~ADD~~~~");
        inventory1.addItem(weapon1);
        inventory1.addItem(weapon2);
        inventory1.addItem(healthPotion1);
        
        System.out.println("~~~~REMOVE~~~~");
        
        
        System.out.println("~~~~USE~~~~");
        
        System.out.println("*----------*Personaje*----------*");
        character1.Attack(npc1);
        npc1.Attack(character1);

        System.out.println("~~~~SHOW~~~~");        
        inventory1.showInventory();
        inventory1.getItemCount();
        
        //Menu de combate por turnos
        System.out.println("*----------*Combate*----------*");
        Combat combat = new Combat(character1, npc1);
        combat.CombatStart();

        System.out.println("*----------*Fin*----------*");

    }
}