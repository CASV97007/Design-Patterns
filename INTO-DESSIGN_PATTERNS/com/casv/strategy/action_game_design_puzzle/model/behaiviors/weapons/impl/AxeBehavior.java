package com.casv.strategy.action_game_design_puzzle.model.behaiviors.weapons.impl;
import com.casv.strategy.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("chop-ping with an axe");
    }

}
