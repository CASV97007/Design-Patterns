package com.casv.observer.weather_data.service.display;


import com.casv.observer.weather_data.service.Observer;
import com.casv.observer.weather_data.service.Subject;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;

    private Subject weatherData;
    

    /**
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:  "+ this.temperature+ "F degrees and " + this.humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

}
