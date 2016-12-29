package com.arun.FactoryDesignPattern2;

public abstract class PizzaStore {

	public void orderPizza(PizzaType typeOfPizza) {

		Pizza pizza = createPizza(typeOfPizza);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.cut();

	}

	protected abstract Pizza createPizza(PizzaType typeOfPizza);

}

class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType typeOfPizza) {
		Pizza pizza = null;
		if (typeOfPizza.equals(PizzaType.CHEESE)) {
			pizza = new NYStyleCheesePizza();
		} else if (typeOfPizza.equals(PizzaType.PEPPERONI)) {
			pizza = new NYStylePepperoniPizza();
		}
		return pizza;
	}
}

class PHStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType typeOfPizza) {
		Pizza pizza = null;
		if (typeOfPizza.equals(PizzaType.CHEESE)) {
			pizza = new PHStyleCheesePizza();
		} else if (typeOfPizza.equals(PizzaType.PEPPERONI)) {
			pizza = new PHStylePepperoniPizza();
		}
		return pizza;
	}
}


