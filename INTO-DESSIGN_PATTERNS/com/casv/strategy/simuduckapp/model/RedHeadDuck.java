package com.casv.strategy.simuduckapp.model;

import com.casv.strategy.simuduckapp.model.duck_behaviors.fly.impl.FlyWithWings;
import com.casv.strategy.simuduckapp.model.duck_behaviors.quack.impl.Quack;

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
