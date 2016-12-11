package com.arun.headfirstexample;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		this.name = "Rubber Duck";
		flyBehaviour = new Cannotfly();
	}

}
