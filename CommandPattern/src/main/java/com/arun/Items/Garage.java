package com.arun.Items;

public class Garage {

	private Light light;

	public Garage(Light light) {
		this.light = light;
	}

	public void up() {
		System.out.println("Shutter up...");
	}

	public void down() {
		System.out.println("Shutter down...");
	}

	public void stop() {
		System.out.println("Shutter stop...");
	}

	public void lightOn() {
		light.switchOn();
	}

	public void lightOf() {
		light.switchOff();
	}

	public void allCommands() {
		up();
		down();
		stop();
		lightOn();
		lightOf();
	}
}
