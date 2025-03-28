/**
 * The abstract class Character defines a character with a weapon and methods for fighting and using
 * weapons.
 */
package com.casv.strategy.action_game_design_puzzle.model;

import com.casv.strategy.action_game_design_puzzle.model.behaiviors.weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeapon(WeaponBehavior wBehavior) {
        this.weaponBehavior = wBehavior;
    }

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }
}
