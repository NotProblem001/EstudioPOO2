package com.example;

public class Weapon extends Item implements Equipable {
    private int damage;
    private boolean equiped = false;

    public Weapon(String name, int value, int damage) {
        super(name, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void Use() {
        if(equiped){
            System.out.println("Attacking whith weapon: " + getName()  + " with damage: " + damage);
        } else{
            System.out.println("Weapon: " + getName() + " is not equipped. Cannot attack.");
        }
    }

    public void Use(int bonus){
        System.out.println("Using weapon: " + getName()  + " with damage: " + (damage + bonus));
    }

    @Override
    public void Equip(){
        equiped = true;
        System.out.println(getName() + " is equipped.");
    }

    @Override
    public void Unequip(){
        equiped = false;
        System.out.println(getName() + " is unequipped.");
    }
}
