package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duckBehaviors.fly.impl.FlyNoWay;
import com.casv.simuduckapp.model.duckBehaviors.quack.impl.Squeak;

/*Implementacion incorrecta por que el pato de goma, no puede volar, es ilógico hacer que herede del de Duck */
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Looks like a RubberDuck");
    }

}
