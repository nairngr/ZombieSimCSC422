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

     // Method for having this Team attack oppTeam to be used in a battle method.
    public void fight(Team oppTeam) {
        for (Character attacker : this.list) {
            for (Character defender : oppTeam.list) {
                if (attacker.getHealth() > 0 && defender.getHealth() > 0) {
                    // Reduce defender's health by attacker's attack
                    defender.setHealth(defender.getHealth() - attacker.getAttack());

                    // Print details of the attack only if the defender is killed
                    if (defender.getHealth() <= 0) {
                        System.out.println(attacker.getName() + " killed " + defender.getName());
                    }//else {
                    //System.out.println(attacker.getName() + " attacked " + defender.getName() +
                          //  " (Health: " + defender.getHealth() + ")");
                    //}
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
        
        System.out.println("We have " + this.list.size() + " survivors trying to make it to safety.(0 children, 3 teachers, 2 soldiers)");
        System.out.println("But there are " + zombies.list.size() + " zombies waiting for them.(2 common infected, 7 tanks)\n");
        
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

