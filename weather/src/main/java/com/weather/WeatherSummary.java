package com.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeatherSummary {
    private List<Double> temperatures = new ArrayList<>();
    private List<Double> humidities = new ArrayList<>();
    private List<Double> windSpeeds = new ArrayList<>();
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    @SuppressWarnings("unused")
    private Object dominantWeather = "";
    private HashMap<String, Integer> weatherCount = new HashMap<>();

    public void updateSummary(WeatherData data) {
        temperatures.add(data.getTemp());
        humidities.add(data.getHumidity());
        windSpeeds.add(data.getWindSpeed());

        maxTemp = Math.max(maxTemp, data.getTemp());
        minTemp = Math.min(minTemp, data.getTemp());

        // Count occurrences of weather conditions for dominant weather
        weatherCount.put(data.getMain(), weatherCount.getOrDefault(data.getMain(), 0) + 1);
    
                        
                            
    }

    public double calculateAverageTemperature() {
        return temperatures.stream().mapToDouble(null).average().orElse(0.0);
    }

    public double calculateAverageHumidity() {
        return humidities.stream().mapToDouble(null).average().orElse(0.0);
    }

    public double calculateAverageWindSpeed() {
        return windSpeeds.stream().mapToDouble(null).average().orElse(0.0);
    }

    public String getMaxTemp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaxTemp'");
    }

    public String getMinTemp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMinTemp'");
    }

    public String getDominantWeather() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDominantWeather'");
    }

    // Getters and Setters
}

