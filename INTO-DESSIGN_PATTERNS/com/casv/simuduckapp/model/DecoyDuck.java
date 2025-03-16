package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duckBehaviors.fly.FlyBehavior;
import com.casv.simuduckapp.model.duckBehaviors.quack.QuackBehavior;

public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display() {
        log.warning("Looks like wooden decoy duck");
    }

    @Override
    public void fly() {
        // No hace nada
    }

    @Override
    public void quack() {
        // NO hace nada
    }
}
