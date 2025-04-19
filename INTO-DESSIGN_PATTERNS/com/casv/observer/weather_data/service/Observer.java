package com.casv.observer.weather_data.service;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
