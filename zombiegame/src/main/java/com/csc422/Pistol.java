package com.csc422;

// Pistol class
public class Pistol implements Weapon {
    private final int power = 20;
    private final int accuracy = 45;
    public String name = "pistol";

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
    public boolean isMeleeWeapon(){
        return false;
    }
}