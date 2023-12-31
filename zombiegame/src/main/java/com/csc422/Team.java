package com.csc422;

import java.util.ArrayList;

public class Team {
    public ArrayList<Character> list;
    public Boolean active = true;

    // Getters and setters
    public Team(ArrayList<Character> list) {
        this.list = list;
    }

    public ArrayList<Character> getList() {
        return this.list;
    }

    // A check to ensure there is at least one living character on a team
    public void checkActive() {
        int living = 0;
        for (Character c : this.list) { // For-each character in the given team
            if (c.health > 0) { // Check if their health is above 0
                living++; // if health above 0 found, add 1 to local var living
            }
        }
        if (living <= 0) { // if living is 0, the team is switched to active false
            this.active = false;
        }
    }

    public void fight(Team oppTeam) {
        for (Character attacker : this.list) {
            for (Character defender : oppTeam.list) {
                if (attacker.getHealth() > 0 && defender.getHealth() > 0) {
                    Weapon weapon = attacker.weapon; // Retrieve the attacker's weapon
                    // Check if the attack hits based on accuracy
                    double hitProbability = Math.random() * 100; // Random number between 0 and 100
                    if (hitProbability <= weapon.getAccuracy()) {
                        // Attack hits
                        defender.setHealth(defender.getHealth() - attacker.getAttack());
                        System.out.println(attacker.getName() + " hits " + defender.getName() +
                                " with their " + weapon.getName() +
                                " for " + attacker.getAttack() + " damage.");

                        // Print details of the attack only if the defender is killed
                        if (defender.getHealth() <= 0) {
                            System.out.println(attacker.getName() + " killed " + defender.getName() +
                                    " with their " + weapon.getName());
                        }
                    } else {
                        // Attack misses
                        System.out.println(attacker.getName() + "'s attack with " +
                                weapon.getName() + " misses " + defender.getName());
                    }
                }
            }
        }
    }

    
    //Counts the number of survivors
    public int countSurvivors() {
        int count = 0;
        for (Character c : this.list) {
            if(c.health > 0) {
                count++;
            }
        }
        return count;
    }
    
    // The initiating class battles the target (zombies) until one team is completely dead
    public void battle(Team zombies) {
        
        System.out.println("We have " + this.list.size() + " survivors trying to make it to safety.\n");
        System.out.println("But there are " + zombies.list.size() + " zombies waiting for them\n");
        
        while (this.active && zombies.active) {
            this.checkActive();
            this.fight(zombies);
            zombies.checkActive();
            zombies.fight(this);
        }

        int survivors = countSurvivors();

        if (survivors > 0) {
            System.out.println(survivors + " have made it to safety.");
        } else {
            System.out.println("None of the survivors made it.");
        }
    }
}

