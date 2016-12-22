package com.arun;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		super();
		description = "DarkRoast Coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
