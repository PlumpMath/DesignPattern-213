package com.arun.SimpleFactoryDesignPattern;

public class Client {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizza = new PizzaStore(factory);
		pizza.orderPizza("Cheese");
		pizza.orderPizza("Pepperoni");
	}

}
