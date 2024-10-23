package com.weather;

import java.util.List;

public class WeatherForecastTest {
    @Test
    public void testFetchWeatherForecast() throws Exception {
        WeatherAPI api = new WeatherAPI();
        List<WeatherData> forecast = api.fetchWeatherForecast("Delhi");
        assertNotNull(forecast);
        assertFalse(forecast.isEmpty());
    }

    private void assertNotNull(List<WeatherData> forecast) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
    }

    private void assertFalse(boolean empty) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
    }
}

