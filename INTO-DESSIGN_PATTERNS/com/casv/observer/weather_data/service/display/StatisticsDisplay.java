package com.casv.observer.weather_data.service.display;

import com.casv.observer.weather_data.service.Observer;
import com.casv.observer.weather_data.service.Subject;

public class StatisticsDisplay implements Display, Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0f;
    private int numReadings = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float avgTemp = this.tempSum / this.numReadings;
        System.out.printf(
                "Stats -> Avg: %.1f °C, Max: %.1f °C, Min: %.1f °C%n",
                avgTemp, this.maxTemp, this.minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Acumular estadísticas
        this.tempSum += temperature;
        this.numReadings++;

        if (temperature > this.maxTemp) {
            this.maxTemp = temperature;
        }
        if (temperature < this.minTemp) {
            this.minTemp = temperature;
        }
        this.display();
    }

}
