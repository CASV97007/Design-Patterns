package com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("shoot-ing an arrow with a bow");
    }

}
