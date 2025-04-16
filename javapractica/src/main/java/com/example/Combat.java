package com.example;

public class Combat {
    private Character playerCharacter;
    private Npc enemyCharacter;

    public Combat(Character playerCharacter, Npc enemyCharacter){
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void CombatStart(){
        System.out.println("You have encountered an enemy " + enemyCharacter.getName());
        while (isThereCombat());
    }

    public Boolean isThereCombat(){
        if(playerCharacter.getCurrentHealt() < 0){
            playerCharacter.setIsDead(true);
            return playerCharacter.getIsDead();
        }else if(enemyCharacter.getCurrentHealt() < 0){
            enemyCharacter.setIsDead(true);
            return enemyCharacter.getIsDead();
        }
        return true;   
    }

}
