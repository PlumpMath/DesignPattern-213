package com.arun.NewThinkTank;

public interface Subject {

	void registerObserver(Observer newObserver);

	void notifyObserver();

	void removeObserver(Observer deleteObserver);

}
