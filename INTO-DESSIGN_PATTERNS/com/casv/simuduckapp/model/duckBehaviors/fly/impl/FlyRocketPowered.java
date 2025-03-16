package com.casv.simuduckapp.model.duckBehaviors.fly.impl;

import com.casv.simuduckapp.model.duckBehaviors.fly.FlyBehavior;

/**
 * FlyRocketPowered is a class that implements the FlyBehavior interface.
 * It provides a specific implementation of the fly method for ducks that fly with a rocket.
 */
public class FlyRocketPowered  implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }

}
