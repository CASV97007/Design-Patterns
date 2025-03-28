package com.casv.strategy.action_game_design_puzzle.model.behaiviors.weapons.impl;

import com.casv.strategy.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("swing-ing a sword");
    }

}
