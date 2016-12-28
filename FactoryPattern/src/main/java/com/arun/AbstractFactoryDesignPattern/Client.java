package com.arun.AbstractFactoryDesignPattern;

public class Client {
	
	public static void main(String[] args) {
		PizzaStore store = new NyPizzaStore();
		store.orderPizza("Pepperoni");
		
		System.out.println("================");
		store = new CaliforniaPizzaStore();
		store.orderPizza("Cheese");
	}

}
