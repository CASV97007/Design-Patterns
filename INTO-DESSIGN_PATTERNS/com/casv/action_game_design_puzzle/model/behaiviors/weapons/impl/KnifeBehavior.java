/**
 * This class implements the WeaponBehavior interface for using a knife as a weapon.
 */
package com.casv.action_game_design_puzzle.model.behaiviors.weapons.impl;

import com.casv.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("implements cutting with a knife");
    }

}
