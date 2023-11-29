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
        for (Character a : this.list) { // for each character in this list
            for (Character d : oppTeam.list) { // loop over each character in the opposing list
                if (a.health > 0 && d.health > 0) { // checks to ensure the attack isn't dead and the defender isn't
                                                    // dead. If they are both alive, a attacks d.
                    d.setHealth(d.health - a.attack); // Reduce d health by a attack
                    if (d.health > 0) { // if d is alive prints the attack
                        System.out.println(a.name + " attacks " + d.name + " and " + d.name + " now has " + d.health
                                + " health remaining.");
                    } else { // if d is dead prints that a killed d
                        System.out.println(a.name + " killed " + d.name);
                    }
                }
            }
        }
    }

    // The initiating class battles the target (zombies) until one team is completely dead
    public void battle(Team zombies) {
        while (this.active == true && zombies.active == true) { // loops while both teams are still active
            this.checkActive();
            this.fight(zombies);
            zombies.checkActive();
            zombies.fight(this);
        }
    }
}
