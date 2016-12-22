package com.arun;

public class BeverageMain {

	public static void main(String[] args) {

		Beverage horseBlend = new HorseBlend();
		horseBlend = new Soy(horseBlend);
		horseBlend = new Mocha(horseBlend);
		horseBlend = new Whip(horseBlend);
		System.out.println(horseBlend.getDescription() + " = " + horseBlend.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " = " + darkRoast.cost());
	}

}
