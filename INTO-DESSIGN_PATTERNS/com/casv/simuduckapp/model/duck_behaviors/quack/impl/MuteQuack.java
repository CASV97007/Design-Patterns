package com.casv.simuduckapp.model.duck_behaviors.quack.impl;

import com.casv.simuduckapp.model.duck_behaviors.quack.QuackBehavior;

/**
 * MuteQuack.java
 *
 * Creado por AUTHOR en 16 Mar 2025
 * 
 * <p>
 * This class represents a quack behavior where the duck does not make any sound.
 * </p>
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
