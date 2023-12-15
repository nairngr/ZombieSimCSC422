package com.csc422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Main to be updated later
public class Main {

    // Names for survivors
    static List<String> survivorNames = Arrays.asList(
            "Max", "Luna", "Charlie", "Bella", "Jack", "Lucy", "Oliver", "Molly",
            "Noah", "Johnny", "Liam", "Sadie", "Carlos", "Isabella", "Mohammed",
            "Hernandez", "Jose", "Carmen", "Ahmed", "Aisha");

    public static void main(String[] args) {
        System.out.println("\n---Welcome to Zombie Survival---\n");

        Team zombies = generateZombies();
        Team survivors = generateSurvivors();

        // initiate the battle
        survivors.battle(zombies);
    }

    // randomly generates an amount of zombies between 5 and 20
    private static Team generateZombies() {
        ArrayList<Character> zombieList = new ArrayList<>();

        int numZombies = getRandomNumber(15, 40);

        // Generate the two zombie types randomly
        for (int i = 0; i < numZombies; i++) {
            if (Math.random() < 0.9) {
                zombieList.add(new CommonInfected("Common Infected"));
            } else {
                zombieList.add(new Tank("Tank"));
            }
        }

        return new Team(zombieList);
    }

    // randomly generates an amount of survivors between 10 and 20
    private static Team generateSurvivors() {
        ArrayList<Character> survivorList = new ArrayList<>();

        int numSurvivors = getRandomNumber(5, 15);

        // Generate the three survivor types randomly
        for (int i = 0; i < numSurvivors; i++) {
            double randomValueChar = Math.random();
            double randomValueWep = Math.random(); // For generation of a random weapon
            if (randomValueChar < 0.33) {
                survivorList.add(new Child("Child " + survivorNames.get(i)));
            } else if (randomValueChar < 0.66) {
                survivorList.add(new Soldier("Soldier " + survivorNames.get(i)));
            } else {
                survivorList.add(new Teacher("Teacher " + survivorNames.get(i)));
            }
            if (randomValueWep < .05) {
                System.out.println("Uh oh! " + survivorList.get(i).getName() + " could not find a weapon!");
            } else if (randomValueWep < .20) {
                System.out.println(survivorList.get(i).getName() + " picks up a frying pan. Better than nothing!");
                survivorList.get(i).setWeapon(new FryingPan());
            } else if (randomValueWep < .35) {
                System.out.println(survivorList.get(i).getName() + " equips an assault rifle. Nice!");
                survivorList.get(i).setWeapon(new AssaultRifle());
            } else if (randomValueWep < .50) {
                System.out.println(survivorList.get(i).getName() + " hefts an axe. Chop chop!");
                survivorList.get(i).setWeapon(new Axe());
            } else if (randomValueWep < .65) {
                System.out.println(survivorList.get(i).getName() + " holsters a pistol.");
                survivorList.get(i).setWeapon(new Pistol());
            } else if (randomValueWep < .80) {
                System.out.println(survivorList.get(i).getName() + " racks a shotgun.");
                survivorList.get(i).setWeapon(new Shotgun());
            } else if (randomValueWep < .95) {
                System.out.println(survivorList.get(i).getName() + " readies a submachinegun.");
                survivorList.get(i).setWeapon(new SubmachineGun());
            } else {
                if (survivorList.get(i) instanceof Teacher) {
                    System.out.println("\nRise and shine, Mr. Freeman. Rise and shine...\n");
                    survivorList.get(i).setAttack(100);
                    survivorList.get(i).setHealth(200);
                    survivorList.get(i).setName("Gordon Freeman");
                } else {
                    System.out.println(
                            survivorList.get(i).getName() + " picks up a crow bar. More of a tool than a weapon.");
                    survivorList.get(i).setWeapon(new Crowbar());
                }
            }
        }

        return new Team(survivorList);
    }

    private static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}