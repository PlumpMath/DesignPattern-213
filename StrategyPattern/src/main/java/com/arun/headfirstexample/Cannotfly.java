package com.arun.headfirstexample;

public class Cannotfly implements FlyBehaviour {

	public void performFly(String name) {
		System.out.println(name + " cannot fly..");
	}
}
