package com.casv.observer.weather_data.service;

public interface Subject {
    void registerObserver(Observer o);
    
    void removeObserver(Observer o);

    void notifyObservers();

}
