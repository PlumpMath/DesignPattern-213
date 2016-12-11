package com.arun.headfirstexample;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super();
		this.name = "Mallard Duck";
		flyBehaviour = new FlyWithWings();
	}
}
