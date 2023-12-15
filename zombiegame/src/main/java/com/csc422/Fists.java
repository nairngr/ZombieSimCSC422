package com.csc422;


// Fists class implementing Weapon interface
public class Fists implements Weapon {
    private final int power = 0;
    private final int accuracy = 80;
    public String name = "fists";

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public boolean isMeleeWeapon() {
        return true; // Fists are a melee weapon
    }
}