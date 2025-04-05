package com.casv.observer.weather_data.service.display;

public class ForecastDisplay implements Display{

    @Override
    public void display() {
        System.out.println("Displaying the forecast information.");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: More of the same weather conditions.");
    }

}
