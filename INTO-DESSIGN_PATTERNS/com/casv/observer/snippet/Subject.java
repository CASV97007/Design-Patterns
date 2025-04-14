package com.casv.observer.snippet;

/**
 * Here’s the Subject interface.
 * Objects use this interface to register
 * as observers and also to remove
 * themselves from being observers.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();// Register an observer to be notified of changes
}
