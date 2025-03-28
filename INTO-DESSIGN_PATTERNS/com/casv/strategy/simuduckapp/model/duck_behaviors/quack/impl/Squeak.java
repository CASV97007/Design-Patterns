package com.casv.strategy.simuduckapp.model.duck_behaviors.quack.impl;

import com.casv.strategy.simuduckapp.model.duck_behaviors.quack.QuackBehavior;


public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
