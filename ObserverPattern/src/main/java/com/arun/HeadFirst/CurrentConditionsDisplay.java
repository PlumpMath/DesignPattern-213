package com.arun.HeadFirst;

public class CurrentConditionsDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

	}

	public void display() {
		System.out.println("The current Condition are : Temperature = " + temperature + " humidity = " + humidity
				+ " Presssure = " + pressure);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
