package com.example;

public abstract class LivingEntity implements IDamageable{
    private int maxHealt;
    private int currentHealt;
    private Boolean isDead = false;

    public LivingEntity(int maxHealt){
        this.maxHealt = maxHealt;
        this.currentHealt = maxHealt;
    }

    public int getMaxHealt(){
        return maxHealt;
    }

    public int getCurrentHealt(){
        return currentHealt;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public Boolean setIsDead(Boolean isDead) {
        this.isDead = isDead;
        return isDead;
    }

    @Override
    public void ReceiveDamage(int damage){
        currentHealt -= damage;
        System.out.println("You have received "+ damage + " points of damage, Your current healt is :"+getCurrentHealt());
    }

    public abstract void Attack(LivingEntity enemyEntity);

}
