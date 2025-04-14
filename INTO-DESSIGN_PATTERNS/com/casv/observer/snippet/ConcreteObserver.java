package com.casv.observer.snippet;

/**
 * Concrete observers can be
 * any class that implements the
 * Observer interface. Each
 * observer registers with a concrete
 * subject to receive updates.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(String status) {
        // Implementation of the update method
        System.out.println("ConcreteObserver: State updated.: "+status);
    }
    // Additional methods and properties specific to ConcreteObserver can be added
    // here
    // For example, you might want to store a reference to the subject or maintain
    // some state

}
