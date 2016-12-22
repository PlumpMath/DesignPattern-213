package com.arun;

public class Espresso extends Beverage {

	public Espresso(SizeBeverage orderSize) {
		description = "Espresso Coffee";
		size = orderSize;
	}

	@Override
	public double cost() {
		double cost = 1.99;
		switch (size) {
		case LARGE:
			cost += 20;
			break;
		case MEDIUM:
			cost += 15;
			break;
		case SMALL:
			cost += 10;
			break;
		}
		return cost;
	}

}
