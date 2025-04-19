package com.casv.observer.weather_data.service.display;


import com.casv.observer.weather_data.service.Observer;
import com.casv.observer.weather_data.service.Subject;

public class ForecastDisplay implements Display, Observer {

    private float currentPressure = 29.92f; // presión inicial estándar
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String forecast;
        if (this.currentPressure > this.lastPressure) {
            forecast = "Forecast: Improving weather on the way!";
        } else if (this.currentPressure == this.lastPressure) {
            forecast = "Forecast: More of the same.";
        } else {
            forecast = "Forecast: Watch out for cooler, rainy weather.";
        }
        System.out.println(forecast);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        this.display();
    }

}
