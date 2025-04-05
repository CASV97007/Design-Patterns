package com.casv.observer.weather_data.service.display;

public class StatisticsDisplay implements Display {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (this.tempSum / this.numReadings) + "/" + this.maxTemp + "/" + this.minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.tempSum += temperature;
        this.numReadings++;

        if (temperature > this.maxTemp) {
            this.maxTemp = temperature;
        }

        if (temperature < this.minTemp) {
            this.minTemp = temperature;
        }

        this.display(); // Call display to show the updated statistics
    }

}
