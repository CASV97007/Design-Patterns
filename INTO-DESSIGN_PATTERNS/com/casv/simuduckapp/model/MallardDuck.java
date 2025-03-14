package com.casv.simuduckapp.model;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        log.warning("Looks like a Mallard");
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
