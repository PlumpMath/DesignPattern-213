package com.arun.FactoryDesignPattern2;

public interface Pizza {

	// This is the product which is to be used

	void prepare();

	void bake();

	void cut();

	void box();

}

class NYStyleCheesePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing NY Style Cheese Pizza");
	}

	public void bake() {
		System.out.println("Baking NY Style Cheese Pizza");
	}

	public void cut() {
		System.out.println("Cutting NY Style Cheese Pizza");
	}

	public void box() {
		System.out.println("Boxing NY Style Cheese Pizza");
	}

}

class NYStylePepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing NY Style Pepperoni Pizza");
	}

	public void bake() {
		System.out.println("Baking NY Style Pepperoni Pizza");
	}

	public void cut() {
		System.out.println("Cutting NY Style Pepperoni Pizza");
	}

	public void box() {
		System.out.println("Boxing NY Style Pepperoni Pizza");
	}
}

class PHStyleCheesePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing PH Style Cheese Pizza");
	}

	public void bake() {
		System.out.println("Baking PH Style Cheese Pizza");
	}

	public void cut() {
		System.out.println("Cutting PH Style Cheese Pizza");
	}

	public void box() {
		System.out.println("Boxing PH Style Cheese Pizza");
	}

}

class PHStylePepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing PH Style Pepperoni Pizza");
	}

	public void bake() {
		System.out.println("Baking PH Style Pepperoni Pizza");
	}

	public void cut() {
		System.out.println("Cutting PH Style Pepperoni Pizza");
	}

	public void box() {
		System.out.println("Boxing PH Style Pepperoni Pizza");
	}
}
