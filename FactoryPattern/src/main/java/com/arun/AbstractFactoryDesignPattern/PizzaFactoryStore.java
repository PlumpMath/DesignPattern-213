package com.arun.AbstractFactoryDesignPattern;

public abstract class PizzaFactoryStore {
	
	protected void orderPizza(PizzaEnum typeOfPizza){
		Pizza pizza = createPizza(typeOfPizza);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
	protected abstract Pizza createPizza(PizzaEnum typeOfPizza);
}

class NYPizzaFactoryStore extends PizzaFactoryStore{
	FactoryIngredient factoryIngredient = new NYFactoryIngredient();
	@Override
	protected Pizza createPizza(PizzaEnum typeOfPizza) {
		Pizza pizza = null;
		if(PizzaEnum.CHEESE.equals(typeOfPizza)){
			System.out.println("Preparing NY Cheese Pizza");
			pizza = new NYCheesePizza(factoryIngredient);
		}
		return pizza;
	}
}

class ChicagoPizzaFactoryStore extends PizzaFactoryStore{
	FactoryIngredient factoryIngredient = new ChicagoFactoryIngredient();
	@Override
	protected Pizza createPizza(PizzaEnum typeOfPizza) {
		Pizza pizza = null;
		if(PizzaEnum.CHEESE.equals(typeOfPizza)){
			System.out.println("Preparing Chicago Cheese Pizza");
			pizza = new ChicagoCheesePizza(factoryIngredient);
		}
		return pizza;
	}
}
