package com.arun.HeadFirst;

public interface Subject {
	
	/*
	 * Observer pattern defines one to many relationship where change in state
	 * of object is notified to all its dependents
	 */ 
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();

}
