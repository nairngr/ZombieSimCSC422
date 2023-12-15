package com.csc422;

// FryingPan class
public class FryingPan implements Weapon {
    private final int power = 5;
    private final int accuracy = 75;

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