package com.csc422;

import java.util.ArrayList;
import java.util.Random;

// Main to be updated later
public class Main {
    public static void main(String[] args) {
        Team zombies = createZombies();
        Team survivors = createSurvivors();

        // initiate the battle
        survivors.battle(zombies);
    }
    
    //generate the 5 survivors
    public static Team createSurvivors(){
        ArrayList<Character> survivorList = new ArrayList<>();
                
        for (int i = 1; i <= 2; i++) {
            survivorList.add(new Soldier("Soldier " + i));
        }

        for (int i = 1; i <= 3; i++) {
            survivorList.add(new Teacher("Teacher " + i));
        }

         return new Team(survivorList);
        
    }
    
    //generate the 9 zombies
    public static Team createZombies(){
        ArrayList<Character> zombieList = new ArrayList<>();
        
        
        for (int i = 1; i <= 2; i++) {
            zombieList.add(new CommonInfected("CommonInfected " + i));
        }

        for (int i = 1; i <= 7; i++) {
            zombieList.add(new Tank("Tank " + i));
        }
        
        return new Team(zombieList);
    }
   
    //randomly generates an amount of zombies between 5 and 20
    private static Team generateZombies() {
        ArrayList<Character> zombieList = new ArrayList<>();
        
         int numZombies = getRandomNumber(5, 20);


        // Generate the two zombie types randomly
        for (int i = 0; i < numZombies; i++) {
            if (Math.random() < 0.5) {
                zombieList.add(new CommonInfected("Common Infected"));
            } else {
                zombieList.add(new Tank("Tank"));
            }
        }

        return new Team(zombieList);
    }
    
    //randomly generates an amount of survivors between 10 and 20
    private static Team generateSurvivors() {
        ArrayList<Character> survivorList = new ArrayList<>();
        
         int numSurvivors = getRandomNumber(10, 20);

        // Generate the three survivor types randomly
        for (int i = 0; i < numSurvivors; i++) {
            double randomValue = Math.random();

            if (randomValue < 0.33) {
                survivorList.add(new Child("Child"));
            } else if (randomValue < 0.66) {
                survivorList.add(new Soldier("Soldier"));
            } else {
                survivorList.add(new Teacher("Teacher"));
            }
        }

        return new Team(survivorList);
    }
    
    private static int getRandomNumber(int min, int max) {
       Random rand = new Random();
       return rand.nextInt((max - min) + 1) + min;
    }
}