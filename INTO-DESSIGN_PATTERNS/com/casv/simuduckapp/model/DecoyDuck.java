package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duckBehaviors.fly.impl.FlyNoWay;
import com.casv.simuduckapp.model.duckBehaviors.quack.impl.MuteQuack;

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
