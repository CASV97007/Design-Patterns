package com.casv.simuduckapp.model.duckBehaviors.quack.impl;

import com.casv.simuduckapp.model.duckBehaviors.quack.QuackBehavior;


public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
