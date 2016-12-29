package com.arun.AbstractFactoryDesignPattern;

public class Client {

	public static void main(String[] args) {
		PizzaFactoryStore order = new NYPizzaFactoryStore();
		order.orderPizza(PizzaEnum.CHEESE);
		System.out.println("================");
		order = new ChicagoPizzaFactoryStore();
		order.orderPizza(PizzaEnum.CHEESE);
	}

}
