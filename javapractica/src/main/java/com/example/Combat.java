package com.example;

import java.util.Scanner;

public class Combat {
    private Character playerCharacter;
    private Npc enemyCharacter;
    private int turnCounter;

    public Combat(Character playerCharacter, Npc enemyCharacter){
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
        turnCounter = 1;
    }

    public void CombatStart(){
        System.out.println("You have encountered an enemy " + enemyCharacter.getName());
        while (isThereCombat()){
            System.out.println("Turn " + turnCounter + ": ");
            turnCounter++;
            playerTurn();
            if (isThereCombat()) {
                enemyTurn();
            }
            System.out.println("Your current healt is: " + playerCharacter.getCurrentHealt());
            System.out.println("Enemy current healt is: " + enemyCharacter.getCurrentHealt());
            System.out.println("-------------------------------------------------");
            System.out.println("Press Enter to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        if(playerCharacter.getIsDead()){
            System.out.println("You have died. Game Over.");
        }else if(enemyCharacter.getIsDead()){
            System.out.println("You have defeated the enemy!");
        }else{
            System.out.println("The combat has ended.");
        }
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
    
    public void playerTurn(){
        System.out.println("Choose an action: \n 1. Attack \n 2. Use item \n 3. Pass");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 1 -> playerCharacter.Attack(enemyCharacter);
            case 2 -> {
                System.out.println("Choose an item to use: ");
                for (int i = 0; i < playerCharacter.getInventory().getItems().size(); i++) {
                    System.out.println(i + ". " + playerCharacter.getInventory().getItems().get(i).getName());
                }
                int itemIndex = scanner.nextInt();
                if (itemIndex >= 0 && itemIndex < playerCharacter.getInventory().getItems().size()) {
                    Item item = playerCharacter.getInventory().getItems().get(itemIndex);
                    playerCharacter.setEquippable(itemIndex);
                    if (item instanceof Potion potion) {
                        potion.Use();
                    } else if (item instanceof Tools tool) {
                        tool.Use();
                    } else if (item instanceof Weapon weapon) {
                        weapon.Use();
                    } else {
                        System.out.println("Invalid item type.");
                    }
                } else {
                    System.out.println("Invalid item index.");
                }
                
            }
            case 3 -> System.out.println("You passed your turn.");
            default -> System.out.println("Invalid action. Please choose again.");
        }
    }
    
    public void enemyTurn() {
        System.out.println("The enemy attacks!");
        enemyCharacter.Attack(playerCharacter);
    }

    /*Tarea final, es realizar una clase llamada Combat, en esa el personaje (Character) pelea contra un enemigo (Npc). Ambos LivingEntity para completar la clase se tienen que cumplir los siguientes requisitos : 
    
    1.- El combate se realice por turnos en un ciclo while.
    
    2.- El jugador elija una accion desde un menu (atacar, usar un item, pasar) aca pueden utilizar switch para que el usuario pueda escoger su opcion 
    
    3.- El enemigo ataca automaticamente despues del turno del jugador
    
    4.- El combate termina cuando uno de los dos muera que puede ocurrir cuando currentHealth <= 0 o isDead = true
    el diagrama o como se deberia llevar a cabo seria
     
    Inicio combate -> Mostrar menu -> Jugador elige accion -> Ejecutar accion -> Enemigo ataca -> ¿Siguen vivos? ->Se repite el ciclo o termina el combate
    Para capturar el input del usuario utilizaremos Scanner */

}
