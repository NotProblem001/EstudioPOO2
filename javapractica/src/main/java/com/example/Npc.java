package com.example;

public class Npc extends LivingEntity {

    private String name;

    public Npc(String name, int maxHealt){
        super(maxHealt);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Attack(LivingEntity enemyEntity) {
        enemyEntity.ReceiveDamage(10);
    }

}
