package com.casv.observer.weather_data;

import java.util.ArrayList;

import com.casv.observer.weather_data.service.Observer;
import com.casv.observer.weather_data.service.Subject;

/**
 * These three methods return the most
 * weather measurements for temperature, humidity
 * and barometric pressure respectively.
 * We don’t care HOW these variables are set; the
 * WeatherData object knows how to get updated
 * info from the Weather Station.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

}
