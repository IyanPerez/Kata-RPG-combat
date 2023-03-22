package com.factoriaf5.kata;

public class Character {

    private String name;
    private int health;
    private int level;
    private boolean alive;


    public Character(String name) {
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.alive = true;
    }
    

    public Character() {
    }


    public void dealDamage(Character DamagedCharacter, int damage) {

        if (DamagedCharacter.getHealth()<=damage) {

            DamagedCharacter.setAlive(false);
            DamagedCharacter.setHealth(0);

        } 
        else if (DamagedCharacter.getHealth()>=damage){
            
            DamagedCharacter.setHealth(DamagedCharacter.getHealth()-damage);
        }
    }
    
    public void heal(Character HealedCharacter, int healing) {

        if (HealedCharacter.isAlive()==false) {
            System.out.println(HealedCharacter.name + " can not be healed");
        } 
        else if (HealedCharacter.isAlive() == true && healing + HealedCharacter.getHealth() <= 1000){
            HealedCharacter.setHealth(HealedCharacter.getHealth()+healing);
        }
        else {
            HealedCharacter.setHealth(1000);
        }
    }


    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", health=" + health + ", level=" + level + ", alive=" + alive + "]";
    }
    
    
}


