package com.casv.strategy.simuduckapp.model;

import com.casv.strategy.simuduckapp.model.duck_behaviors.fly.impl.FlyNoWay;
import com.casv.strategy.simuduckapp.model.duck_behaviors.quack.impl.MuteQuack;

public class DecoyDuck extends Duck  {
public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
}
    @Override
    public void display() {
        System.out.println("Looks like a DecoyDuck");
    }

}
