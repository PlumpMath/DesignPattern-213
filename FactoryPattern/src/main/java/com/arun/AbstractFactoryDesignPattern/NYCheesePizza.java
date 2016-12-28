package com.arun.AbstractFactoryDesignPattern;

public class NYCheesePizza implements Pizza{

	public void prepare() {
		System.out.println("Preparing Cheese Pizza of NewYork");
	}

	public void bake() {
		System.out.println("Baking Cheese Pizza of NewYork");

	}

	public void cut() {
		System.out.println("Cutting Cheese Pizza of NewYork");

	}

	public void box() {
		System.out.println("Boxing Cheese Pizza of NewYork");

	}

}
