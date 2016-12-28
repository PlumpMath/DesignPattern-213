package com.arun.AbstractFactoryDesignPattern;

public class Client {
	
	public static void main(String[] args) {
		PizzaStore store = new NyPizzaStore();
		Pizza pizza = store.createPizza("Pepperoni");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		System.out.println("================");
		store = new CaliforniaPizzaStore();
		Pizza pizza1 = store.createPizza("Cheese");
		pizza1.prepare();
		pizza1.bake();
		pizza1.cut();
		pizza1.box();
	}

}
