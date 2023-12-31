package com.csc422;

// Axe class
public class Axe implements Weapon {
    private final int power = 10;
    private final int accuracy = 80;
    public String name = "axe";

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
        return true;
    }
}
