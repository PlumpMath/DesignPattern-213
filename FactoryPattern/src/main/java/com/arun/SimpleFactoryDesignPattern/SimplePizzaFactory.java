package com.arun.SimpleFactoryDesignPattern;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("Pepperoni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}

}
