package com.csc422;

// Child survivor
public class Child extends Character {
    public Child(String name) {
        this.name = name;
        this.health = 20;
        this.attack = 2;
        this.survivor = true;
        this.alive = "alive";
    }
}
