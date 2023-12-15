package com.csc422;

public class Shotgun implements Weapon {
    private final int power = 15;
    private final int accuracy = 75;
    public String name = "shotgun";

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
        return false; // Shotgun is not a melee weapon
    }
}