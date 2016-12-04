package com.arun.constant;

import com.arun.changes.AbleToFly;

public class FlyingFrog extends Animal {
	
	public FlyingFrog(){
		fly = new AbleToFly();
	}

	@Override
	public void makeSound() {
		System.out.println("Frog ribbet");
	}

	@Override
	public void eatingHabits() {
		System.out.println("carnivorous");
	}

}
