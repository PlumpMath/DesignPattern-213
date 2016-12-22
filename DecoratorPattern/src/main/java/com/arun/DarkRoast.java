package com.arun;

public class DarkRoast extends Beverage {

	public DarkRoast(SizeBeverage orderSize) {
		description = "DarkRoast Coffee";
		size = orderSize;
	}

	@Override
	public double cost() {
		double cost = .99;
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
