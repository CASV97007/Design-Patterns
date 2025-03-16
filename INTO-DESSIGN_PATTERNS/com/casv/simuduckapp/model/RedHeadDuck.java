package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duckBehaviors.fly.FlyBehavior;
import com.casv.simuduckapp.model.duckBehaviors.quack.QuackBehavior;

public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display() {
        log.warning("Looks like a RedHead");
    }

    @Override
    public void quack() {
        log.warning("Quacking");
    }

    @Override
    public void fly() {
        log.warning("Quacking");
    }

}
