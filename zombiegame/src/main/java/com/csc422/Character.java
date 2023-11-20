package com.csc422;

// Character parent abstract class
public class Character {
    // Attributes that all characters have
    int health;
    int attack;
    // If they are a survivor, set to true, if a zombie, set to false
    Boolean survivor;

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
        return attack;
    }

    public void setSurvivor(Boolean status) {
        this.survivor = status;
    }

    public Boolean getSurvivor() {
        return survivor;
    }
}