package com.casv.action_game_design_puzzle.model;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior=new AxeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("fight likek a troll");
    }

}
