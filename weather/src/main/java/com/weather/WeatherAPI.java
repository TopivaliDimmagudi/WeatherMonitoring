package com.weather;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherAPI {
    private final String apiKey = "YOUR_API_KEY";
    private final OkHttpClient client = new OkHttpClient();

    public WeatherData fetchCurrentWeather(String city) throws Exception {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, apiKey);
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            // Parse response to WeatherData object using Gson
            WeatherData data = new Gson().fromJson(response.body().string(), WeatherData.class);
            return data;
        }
    }

    public List<WeatherData> fetchWeatherForecast(String city) throws Exception {
        String url = String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric", city, apiKey);
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            JsonObject jsonResponse = new Gson().fromJson(response.body().string(), JsonObject.class);
            JsonArray list = jsonResponse.getAsJsonArray("list");
            List<WeatherData> forecastData = new ArrayList<>();
            for (JsonElement element : list) {
                WeatherData data = new Gson().fromJson(element, WeatherData.class);
                forecastData.add(data);
            }
            return forecastData;
        }
    }
}

