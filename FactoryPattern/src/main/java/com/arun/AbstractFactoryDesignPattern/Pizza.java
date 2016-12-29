package com.arun.AbstractFactoryDesignPattern;

public abstract class Pizza {
	protected FactoryIngredient factoryIngredient;

	public Pizza(FactoryIngredient factoryIngredient) {
		this.factoryIngredient = factoryIngredient;
	}

	abstract void prepare();

	void bake() {
		System.out.println("Baking ");
	};

	void cut() {
		System.out.println("Cutting ");
	};

	void box() {
		System.out.println("Boxing ");
	};

}

class NYCheesePizza extends Pizza {

	public NYCheesePizza(FactoryIngredient factoryIngredient) {
		super(factoryIngredient);
	}

	@Override
	void prepare() {
		System.out.println("Ingredients....");
		Clams clam = factoryIngredient.createClam();
		clam.description();
		Sauce sauce = factoryIngredient.createSauce();
		sauce.description();
		System.out.println("Preparation complete...");
	}
}

class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza(FactoryIngredient factoryIngredient) {
		super(factoryIngredient);
	}

	@Override
	void prepare() {
		System.out.println("Ingredients....");
		Clams clam = factoryIngredient.createClam();
		clam.description();
		Sauce sauce = factoryIngredient.createSauce();
		sauce.description();
		System.out.println("Preparation complete...");
	}
}
