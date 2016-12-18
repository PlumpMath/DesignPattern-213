package com.arun.HeadFirst;

public class StatisticsDisplay implements Observer, Display {
	private float temperature;
	private float pressure;
	private float humidity;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("The statistics Display are : Temperature = " + temperature + " humidity = " + humidity
				+ " Presssure = " + pressure);

	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
