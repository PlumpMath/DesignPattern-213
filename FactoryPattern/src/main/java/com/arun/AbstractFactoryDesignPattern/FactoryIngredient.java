package com.arun.AbstractFactoryDesignPattern;

public abstract class FactoryIngredient {
	public abstract Clams createClam();

	public abstract Sauce createSauce();
}

class NYFactoryIngredient extends FactoryIngredient {

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

	@Override
	public Sauce createSauce() {
		return new FreshSauce();
	}

}

class ChicagoFactoryIngredient extends FactoryIngredient {

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

}
