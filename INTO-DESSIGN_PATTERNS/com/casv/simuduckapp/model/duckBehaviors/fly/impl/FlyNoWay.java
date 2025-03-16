/*
 * FlyNoWay.java
 *
 * Creado por AUTHOR en 16 Mar 2025
 */

package com.casv.simuduckapp.model.duckBehaviors.fly.impl;

import com.casv.simuduckapp.model.duckBehaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}