package com.casv.simuduckapp.model;

import java.util.logging.Logger;

/**
 * Separating what changes from what stays the same
 * The Duck class is still the superclass of all ducks, but we are pulling out
 * the fly and quack behaviors and putting them into another classs tructure.
 * * @author
 */
public abstract class Duck {
    Logger log = Logger.getLogger(getClass().getName());
    //Pull out what varies
    public void swim() {
        log.warning("swimming");

    }

    /**
     * Each duck subtype is responsible for implementing its own display() behavior
     * for how it
     */
    public abstract void display();
    // OTHER duck-like methods...
}
