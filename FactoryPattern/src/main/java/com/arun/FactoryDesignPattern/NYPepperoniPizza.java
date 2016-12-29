package com.arun.FactoryDesignPattern;

public class NYPepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Pepperoni Pizza of NewYork");

	}

	public void bake() {
		System.out.println("Baking Pepperoni Pizza of NewYork");
	}

	public void cut() {
		System.out.println("Cutting Pepperoni Pizza of NewYork");
	}

	public void box() {
		System.out.println("Boxing Pepperoni Pizza of NewYork");
	}
}
