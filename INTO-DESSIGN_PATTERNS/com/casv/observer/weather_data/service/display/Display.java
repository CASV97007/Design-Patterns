package com.casv.observer.weather_data.service.display;

public interface Display {
    void display(); // Display the current weather conditions
    void update(float temperature, float humidity, float pressure); // Update the display with new weather data 
}
