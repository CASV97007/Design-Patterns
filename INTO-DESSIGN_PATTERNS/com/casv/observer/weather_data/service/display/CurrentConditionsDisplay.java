package com.casv.observer.weather_data.service.display;

public class CurrentConditionsDisplay implements Display {

    @Override
    public void display() {
        System.out.println("Displaying the current weather conditions.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity, " + pressure
                + " hPa pressure.");
    }

}
