package com.casv.simuduckapp.model;

import com.casv.simuduckapp.model.duck_behaviors.fly.FlyBehavior;
import com.casv.simuduckapp.model.duck_behaviors.quack.QuackBehavior;

/**
 * Duck.java
 * <p>
 * This class represents a duck with behaviors.
 * </p>
 * 
 * @author CASV97 en 16 Mar 2025
 */
public abstract class Duck {

    /**
     * The behavior variables are declared as the behavior INTERFACE type. Instance
     * variables hold a reference to a specific behavior at runtime.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * Each duck subtype is responsible for implementing its own display() behavior
     * for how it
     */
    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");

    }

    // These methods replace fly () and quack().
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // Setting behavior dynamically We can call these methods anytime we want to
    // change the behavior of a duck on the ﬂy.
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
