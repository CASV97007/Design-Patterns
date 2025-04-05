package com.casv.observer.weather_data;

import com.casv.observer.weather_data.service.display.CurrentConditionsDisplay;
import com.casv.observer.weather_data.service.display.ForecastDisplay;
import com.casv.observer.weather_data.service.display.StatisticsDisplay;

/**
 * These three methods return the most
 * weather measurements for temperature, humidity
 * and barometric pressure respectively.
 * We don’t care HOW these variables are set; the
 * WeatherData object knows how to get updated
 * info from the Weather Station.
 */
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return this.temperature;
    }

    /**
     * @return the humidity
     */
    public float getHumidity() {
        return this.humidity;
    }

    /**
     * @return the pressure
     */
    public float getPressure() {
        return this.pressure;
    }

    public void measurementsChanged() {
        this.currentConditionsDisplay.update(this.getTemperature(), this.getHumidity(), this.getPressure());
        this.statisticsDisplay.update(this.getTemperature(), this.getHumidity(), this.getPressure());
        this.forecastDisplay.update(this.getTemperature(), this.getHumidity(), this.getPressure());
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

}
