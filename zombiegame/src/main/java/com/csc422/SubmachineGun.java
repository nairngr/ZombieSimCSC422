package com.csc422;

// SubmachineGun class
public class SubmachineGun implements Weapon {
    private final int power = 20;
    private final int accuracy = 60;
    public String name = "submachinegun";

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