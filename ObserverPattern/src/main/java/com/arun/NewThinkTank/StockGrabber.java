package com.arun.NewThinkTank;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> lstObserver;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		lstObserver = new ArrayList<Observer>();
	}

	public void registerObserver(Observer newObserver) {
		lstObserver.add(newObserver);
	}

	public void notifyObserver() {
		for (Observer o : lstObserver) {
			o.updateObserver(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void removeObserver(Observer deleteObserver) {
		int indexOfObserver = lstObserver.indexOf(deleteObserver);
		lstObserver.remove(indexOfObserver);
		System.out.println("Observer removed "+deleteObserver.getObserverId());
	}

	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplePrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
