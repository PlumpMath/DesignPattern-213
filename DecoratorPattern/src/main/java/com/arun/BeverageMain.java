package com.arun;

import com.arun.Beverage.SizeBeverage;

public class BeverageMain {

	public static void main(String[] args) {

		/*small HorseBlend*/
		Beverage horseBlend = new HorseBlend(SizeBeverage.MEDIUM);
		horseBlend = new Soy(horseBlend);
		horseBlend = new Mocha(horseBlend);
		horseBlend = new Whip(horseBlend);
		System.out.println(horseBlend.getDescription() + " = " + horseBlend.cost());
		
		/*Medium DarkRoast */
		Beverage darkRoast = new DarkRoast(SizeBeverage.MEDIUM);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " = " + darkRoast.cost());
	}

}
