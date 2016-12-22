/**
 * 
 */
package com.arun;

/**
 * @author Adwiti
 *
 */
public abstract class Beverage {

	public enum SizeBeverage {
		LARGE, MEDIUM, SMALL;
	}

	protected String description;
	protected SizeBeverage size;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public SizeBeverage getSize() {
		return size;
	}

}
