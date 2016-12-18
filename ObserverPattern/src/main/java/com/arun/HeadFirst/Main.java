package com.arun.HeadFirst;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay ssd = new StatisticsDisplay(weatherData);
		weatherData.setMeasurement(12, 23, 56);
		weatherData.removeObserver(ssd); 
		weatherData.setMeasurement(45, 45, 23);
	}

}
