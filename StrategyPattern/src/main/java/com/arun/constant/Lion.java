package com.arun.constant;

import com.arun.changes.NotAbleToFly;

public class Lion extends Animal{
	
	public Lion(){
		fly = new NotAbleToFly();
	}

	@Override
	public void makeSound() {
		System.out.println("Lion roars");
		
	}

	@Override
	public void eatingHabits() {
		System.out.println("carnivorous");
	}

}
