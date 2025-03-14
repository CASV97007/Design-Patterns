package com.casv.simuduckapp.model;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

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
