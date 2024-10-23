package com.weather;

public class WeatherData {
    private String main;
    private double temp;
    private double feels_like;
    private double humidity;
    private double wind_speed;
    private long dt;

    // Getters and Setters
    public String getMain() { return main; }
    public void setMain(String main) { this.main = main; }

    public double getTemp() { return temp; }
    public void setTemp(double temp) { this.temp = temp; }

    public double getFeelsLike() { return feels_like; }
    public void setFeelsLike(double feels_like) { this.feels_like = feels_like; }

    public double getHumidity() { return humidity; }
    public void setHumidity(double humidity) { this.humidity = humidity; }

    public double getWindSpeed() { return wind_speed; }
    public void setWindSpeed(double wind_speed) { this.wind_speed = wind_speed; }

    public long getDt() { return dt; }
    public void setDt(long dt) { this.dt = dt; }
}

