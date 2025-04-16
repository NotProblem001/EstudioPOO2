package com.example;

public class Character extends LivingEntity{
    private String name;
    private Inventory inventory;
    private Equipable equippable; 

    public Character(String name,int maxHealt,Inventory inventory) {
        super(maxHealt);
        this.name = name;
        this.equippable = null;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquippable(int id){
        Item item = inventory.getItems().get(id);
        if(item instanceof Equipable equipable){
            this.equippable = equipable;
            this.equippable.Equip();
            System.out.println("Object: "+ item.getName() +" equipped");
        }else{
            System.out.println("The object "+ item.getName() +" is not equippable");
            return;
        }
        System.out.println("No item found "+id+"in the inventory");
    }

    @Override
    public void Attack(LivingEntity enemyEntity){
        enemyEntity.ReceiveDamage(10);
    }


}