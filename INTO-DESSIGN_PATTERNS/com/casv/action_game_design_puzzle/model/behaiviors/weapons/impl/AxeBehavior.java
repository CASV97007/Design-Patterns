package com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("chop-ping with an axe");
    }

}
