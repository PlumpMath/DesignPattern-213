package com.arun.main;

import com.arun.constant.Animal;
import com.arun.constant.FlyingFrog;
import com.arun.constant.Lion;

public class Main {

	public static void main(String[] args) {
		Animal a = new Lion();
		a.eatingHabits();
		a.makeSound();
		a.performfly();
		
		Animal b = new FlyingFrog();
		b.eatingHabits();
		b.makeSound();
		b.performfly();
	}

}
