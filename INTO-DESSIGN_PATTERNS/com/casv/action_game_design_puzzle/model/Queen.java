package com.casv.action_game_design_puzzle.model;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight like a Queen");
        useWeapon();
    }

}
