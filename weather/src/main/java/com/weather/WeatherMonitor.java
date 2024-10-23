package com.weather;

import java.util.Timer;
import java.util.TimerTask;

import java.util.List;

public class WeatherMonitor {
    private WeatherAPI weatherAPI = new WeatherAPI();
    private WeatherSummary summary = new WeatherSummary();
    private AlertManager alertManager = new AlertManager();

    public void startMonitoring() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @SuppressWarnings("static-access")
            @Override
            public void run() {
                for (String city : new String[]{"Delhi", "Mumbai", "Chennai", "Bangalore", "Kolkata", "Hyderabad"}) {
                    try {
                        WeatherData data = weatherAPI.fetchCurrentWeather(city);
                        summary.updateSummary(data);
                        alertManager.checkAlerts(data);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                displaySummary();
                fetchForecast();
            }
        }, 0, 300000); // every 5 minutes
    }

    private void displaySummary() {
        System.out.println("Average Temperature: " + summary.calculateAverageTemperature());
        System.out.println("Average Humidity: " + summary.calculateAverageHumidity());
        System.out.println("Average Wind Speed: " + summary.calculateAverageWindSpeed());
        System.out.println("Max Temperature: " + summary.getMaxTemp());
        System.out.println("Min Temperature: " + summary.getMinTemp());
        System.out.println("Dominant Weather: " + summary.getDominantWeather());
    }

    @SuppressWarnings("unused")
    private void fetchForecast() {
        for (String city : new String[]{"Delhi", "Mumbai", "Chennai", "Bangalore", "Kolkata", "Hyderabad"}) {
            try {
                List<WeatherData> forecast = weatherAPI.fetchWeatherForecast(city);
                // Process forecast data as needed
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WeatherMonitor monitor = new WeatherMonitor();
        monitor.startMonitoring();
    }
}

