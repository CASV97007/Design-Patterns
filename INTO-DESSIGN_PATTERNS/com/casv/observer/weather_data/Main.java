package com.casv.observer.weather_data;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.measurementsChanged();
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.measurementsChanged();
        weatherData.setMeasurements(78f, 90f, 29.2f);
        weatherData.measurementsChanged();
    }
}
