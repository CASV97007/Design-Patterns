package com.casv.observer.weather_data;

import com.casv.observer.weather_data.service.display.CurrentConditionsDisplay;
import com.casv.observer.weather_data.service.display.ForecastDisplay;
import com.casv.observer.weather_data.service.display.HeatIndexDisplay;
import com.casv.observer.weather_data.service.display.StatisticsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(40, 65, 30.4f);
        weatherData.setMeasurements(32, 70, 29.2f);
        weatherData.setMeasurements(28, 90, 29.2f);
    }
}
