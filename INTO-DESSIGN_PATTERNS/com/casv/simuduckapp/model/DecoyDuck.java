package com.casv.simuduckapp.model;

public class DecoyDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        log.warning("Looks like wooden decoy duck");
    }

    @Override
    public void fly() {
        // No hace nada
    }

    @Override
    public void quack() {
        // NO hace nada
    }
}
