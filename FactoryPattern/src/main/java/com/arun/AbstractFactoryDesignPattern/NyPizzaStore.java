package com.arun.AbstractFactoryDesignPattern;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("Pepperoni")) {
			pizza = new NYPepperoniPizza();
		}
		return pizza;
	}
}
