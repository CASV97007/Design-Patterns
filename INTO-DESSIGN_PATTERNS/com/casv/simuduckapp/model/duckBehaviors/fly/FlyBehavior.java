/**
 * FlyBehavior is an interface that defines a fly method for different flying behaviors.
 * Classes implementing this interface should provide their own implementation of the fly method.
 */
package com.casv.simuduckapp.model.duckBehaviors.fly;

/**
 * FlyBehavior is an interface that all flying classes implement. All new flying
 * classes just need to implement the fly method.
 */
public interface FlyBehavior {
    void fly();
}

