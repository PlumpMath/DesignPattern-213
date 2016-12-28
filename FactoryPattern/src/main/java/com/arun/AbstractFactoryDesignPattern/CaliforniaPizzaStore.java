package com.arun.AbstractFactoryDesignPattern;

public class CaliforniaPizzaStore extends PizzaStore{
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new CaliforniaCheesePizza();
		} else if (type.equals("Pepperoni")) {
			pizza = new CaliforniaPepperoniPizza();
		}
		return pizza;
	}

}
