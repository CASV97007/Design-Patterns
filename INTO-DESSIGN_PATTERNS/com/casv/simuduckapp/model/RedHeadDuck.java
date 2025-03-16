package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duckBehaviors.fly.impl.FlyWithWings;
import com.casv.simuduckapp.model.duckBehaviors.quack.impl.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Looks like a RedHeadDuck");
    }

}
