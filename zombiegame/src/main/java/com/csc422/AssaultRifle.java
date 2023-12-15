package com.csc422;

// AssaultRifle class
public class AssaultRifle implements Weapon {
    private final int power = 30;
    private final int accuracy = 65;

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
        return false; // An assault rifle is not a melee weapon
    }
}
