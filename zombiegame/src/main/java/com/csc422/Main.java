package com.csc422;
import java.util.ArrayList;



// Main to be updated later
public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank("Tank 1");
        Tank tank2 = new Tank("Tank 2");
        Tank tank3 = new Tank("Tank Champion");
        Soldier sgtJohn = new Soldier("Sgt John");
        Soldier cplSammy = new Soldier("Cpl Sammy");

        ArrayList<Character> list1 = new ArrayList<Character>();
        list1.add(tank1);
        list1.add(tank2);
        list1.add(tank3);
        Team zombies = new Team(list1);

        ArrayList<Character> list2 = new ArrayList<Character>();
        list2.add(sgtJohn);
        list2.add(cplSammy);
        Team survivors = new Team(list2);

        // initiate the battle
        survivors.battle(zombies);

    }
}