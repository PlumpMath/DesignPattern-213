package com.arun.AbstractFactoryDesignPattern;

public interface Ingredient {
}

interface Clams {
	void description();
}

class FreshClams implements Clams {

	public void description() {
		System.out.println("Toppings Fresh Clams");
	}
}

class FrozenClams implements Clams {

	public void description() {
		System.out.println("Toppings Frozen Clams");
	}
}

interface Sauce {
	void description();
}

class FreshSauce implements Sauce {

	public void description() {
		System.out.println("Marina Sauce");
	}
}

class PlumTomatoSauce implements Sauce {

	public void description() {
		System.out.println("Plum Tomato Sauce");
	}
}