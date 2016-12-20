package com.arun.NewThinkTank;

public interface Observer {

	void updateObserver(double ibmPrice, double aaplPrice, double googPrice);
	int getObserverId();

}
