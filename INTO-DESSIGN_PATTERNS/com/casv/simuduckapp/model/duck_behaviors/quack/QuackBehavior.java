/**
 * The QuackBehavior interface defines a contract for quacking behavior
 * that can be implemented by various types of ducks.
 * 
 * Implementing classes should provide their own version of the quack method
 * to define how the duck will quack.
 */
package com.casv.simuduckapp.model.duck_behaviors.quack;

/**
 * Same thing here for the quack behavior; we have an interface that just
 * includes a quack() method that needs to be implemented.
 */
public interface QuackBehavior {
    void quack();
}
