package com.casv.action_game_design_puzzle.model;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight like a Knight");
    }

}
