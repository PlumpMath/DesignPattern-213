package com.arun.AbstractFactoryDesignPattern;

public class CaliforniaPepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Pepperoni Pizza of California");
	}

	public void bake() {
		System.out.println("Baking Pepperoni Pizza of California");

	}

	public void cut() {
		System.out.println("Cutting Pepperoni Pizza of California");

	}

	public void box() {
		System.out.println("Boxing Pepperoni Pizza of California");

	}
}
