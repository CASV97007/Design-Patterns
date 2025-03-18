package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duck_behaviors.fly.impl.FlyNoWay;
import com.casv.simuduckapp.model.duck_behaviors.quack.impl.Quack;

public class ModelDuck extends Duck {
    /**
     * Our model duck begins life grounded... without a way to fly.
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I´m a model Duck");
    }

}
