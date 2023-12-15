package com.csc422;

// Crowbar class
public class Crowbar implements Weapon {
    private final int power = 5;
    private final int accuracy = 100;

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
        return true;
    }
}
