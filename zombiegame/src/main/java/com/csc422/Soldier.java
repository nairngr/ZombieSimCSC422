package com.csc422;

// Soldier Class
public class Soldier extends Character {
    public Soldier(String name) {
        this.name = name;
        this.health = 100;
        this.attack = 10;
        this.survivor = true;
        this.alive = "alive";
    }
}
