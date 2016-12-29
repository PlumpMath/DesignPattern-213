package com.arun.FactoryDesignPattern2;

public class Client {
	public static void main(String[] args) {
		PizzaStore pizza = new NYStylePizzaStore();
		pizza.orderPizza(PizzaType.CHEESE);
		System.out.println("==================");
		pizza.orderPizza(PizzaType.PEPPERONI);
		
		System.out.println("==================");
		
		pizza = new PHStylePizzaStore();
		pizza.orderPizza(PizzaType.CHEESE);
		
		System.out.println("==================");
		
		pizza.orderPizza(PizzaType.PEPPERONI);
	}
}
