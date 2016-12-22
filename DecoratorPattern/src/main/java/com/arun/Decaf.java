package com.arun;

public class Decaf extends Beverage {

	public Decaf(SizeBeverage orderSize) {
		description = "Decaf Coffee";
		size = orderSize;
	}

	@Override
	public double cost() {
		double cost = 1.05;
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
