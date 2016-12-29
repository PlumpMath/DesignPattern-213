package com.arun.FactoryDesignPattern;

public class CaliforniaCheesePizza implements Pizza {
	public void prepare() {
		System.out.println("Preparing Cheese Pizza of California");
	}

	public void bake() {
		System.out.println("Baking Cheese Pizza of California");

	}

	public void cut() {
		System.out.println("Cutting Cheese Pizza of California");

	}

	public void box() {
		System.out.println("Boxing Cheese Pizza of California");

	}
}
