package com.csc422;

// Common Infected class
public class CommonInfected extends Character {
    public CommonInfected(String name) {
        this.name = name;
        this.health = 90;
        this.attack = 5;
        this.survivor = false;
        this.alive = "alive";
    }
}
