package com.arun;

public class HorseBlend extends Beverage {

	public HorseBlend(SizeBeverage ordersize) {
		size = ordersize;
		description = "HorseBlend Coffee";
	}

	@Override
	public double cost() {
		double cost = .89;
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
