package com.csc422;

// Character parent abstract class
public class Character {
    String name;
    // Attributes that all characters have
    int health;
    int attack;
    // If they are a survivor, set to true, if a zombie, set to false
    Boolean survivor;
    String alive;

    Weapon weapon = new Fists(); // Default weapon for each Character

    // Name getters and setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public String getWeapon(){
        return this.weapon.getName();
    }

    public String getName() {
        return this.name;
    }

    // Getters and Setters to be inherited by the child classes
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public int getAttack() {
        return this.attack + this.weapon.getPower();
    }

    public void setSurvivor(Boolean status) {
        this.survivor = status;
    }

    public Boolean getSurvivor() {
        return survivor;
    }

    public void setAlive(String aliveStatus) {
        this.alive = aliveStatus;
    }

    public String getAlive() {
        return alive;
    }

    // Invoke checkHealth on a character to update its alive status dynamically
    public void checkHealth(Character target) {
        if (target.getHealth() <= 0) {
            target.alive = "dead";
        } else {
            target.alive = "alive";
        }
    }
}