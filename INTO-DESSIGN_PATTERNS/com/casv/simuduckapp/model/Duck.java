package com.casv.simuduckapp.model;

import java.util.logging.Logger;

/**
 * All ducks quack and swim, the
 * superclass takes care of the
 * implementation code.
 * 
 * @author
 */
public abstract class Duck {
    Logger log = Logger.getLogger(getClass().getName());

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
