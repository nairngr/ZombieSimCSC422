package com.csc422;

// Main to be updated later
public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Soldier sgtJohn = new Soldier();

        System.out.println("There is a tank with " + tank1.getAttack() + " attack power and " + tank1.getHealth() + " health");

        tank1.setHealth(tank1.getHealth() - sgtJohn.getAttack());

        System.out.println("The tank is attacked by sgtJohn and now has " + tank1.getHealth() + " health");
        

    }
}