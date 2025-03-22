package com.casv.action_game_design_puzzle.model;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior=new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight like a King");
    }

}
