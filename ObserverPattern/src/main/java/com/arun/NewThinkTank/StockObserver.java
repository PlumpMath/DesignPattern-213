package com.arun.NewThinkTank;

public class StockObserver implements Observer {
	private Subject stockGrabber;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	private static int observerIdTracker = 0;
	private int observerId;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		stockGrabber.registerObserver(this);
		observerId = ++observerIdTracker;
		System.out.println("New observer created with Observer Id " + observerId);
	}

	public void updateObserver(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		display();

	}

	public void display() {
		System.out.println("Prices of Stock for " + observerId + " : ");
		System.out.println("IBM : " + ibmPrice + " , Apple : " + aaplPrice + " , Google : " + googPrice);
	}

	public int getObserverId() {
		return observerId;
	}

}
