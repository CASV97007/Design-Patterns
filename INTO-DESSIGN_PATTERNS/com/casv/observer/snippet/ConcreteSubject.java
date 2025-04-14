package com.casv.observer.snippet;

import java.util.ArrayList;
import java.util.List;

/**
 * A concrete subject always
 * implements the Subject
 * interface. In addition to
 * the register and remove
 * methods, the concrete subject
 * implements a notifyObservers()
 * method that is used to update
 * all the current observers
 * whenever state changes.
 */
public class ConcreteSubject implements Subject {
    private String status;
    /**
     * Each subject
     * can have many
     * observers.
     */
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.status);
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * The concrete subject may
     * also have methods for
     * setting and getting its state
     * (more about this later).
     * 
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
        this.notifyObservers();
    }

}
