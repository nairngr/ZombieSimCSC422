package com.csc422;

// Tank Class
public class Tank extends Character {
    public Tank(String name) {
        this.name = name;
        this.health = 150;
        this.attack = 20;
        this.survivor = false;
        this.alive = "alive";
    }
}
