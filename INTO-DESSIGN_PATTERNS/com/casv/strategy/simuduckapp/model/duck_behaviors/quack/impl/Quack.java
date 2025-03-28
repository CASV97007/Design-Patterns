package com.casv.strategy.simuduckapp.model.duck_behaviors.quack.impl;

import com.casv.strategy.simuduckapp.model.duck_behaviors.quack.QuackBehavior;

/**
 * Quack.java
 * <p>
 * This class represents a quack behavior where the duck quacks.
 * </p>
 * 
 * @author CASV97 en 16 Mar 2025
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
