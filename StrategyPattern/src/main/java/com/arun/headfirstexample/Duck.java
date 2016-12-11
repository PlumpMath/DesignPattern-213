package com.arun.headfirstexample;

public abstract class Duck {
	protected FlyBehaviour flyBehaviour;
	protected String name;

	public void swim() {
		System.out.println(name + " can swim");
	}

	public void fly() {
		flyBehaviour.performFly(name);
	}

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
