 # Real-Time Weather Monitoring System
Overview
This project implements a real-time weather monitoring system in Java that retrieves weather data from the OpenWeatherMap API. The system processes current weather conditions and generates daily summaries, including temperature, humidity, and wind speed. It also features alerting mechanisms based on user-defined thresholds and provides functionality for fetching weather forecasts.

Features
Real-Time Weather Data Retrieval: Continuously fetches weather data for major metros in India every 5 minutes.
Data Aggregation: Calculates daily aggregates including:
Average temperature
Maximum temperature
Minimum temperature
Average humidity
Average wind speed
Dominant weather condition
Alerting System: Triggers alerts based on user-defined thresholds for temperature and specific weather conditions.
Forecast Functionality: Retrieves and processes weather forecast data for upcoming days.
Console Visualization: Displays current weather summaries and aggregated data in the console.
Requirements
Java Development Kit (JDK) 11 or higher
Maven or Gradle for dependency management
Internet connection for accessing the OpenWeatherMap API
