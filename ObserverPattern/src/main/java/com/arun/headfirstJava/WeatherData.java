package com.arun.headfirstJava;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	private List<Observer> obs;
	private float temperature;
	private float humidity;
	private float pressure;
	

	@Override
	public synchronized void addObserver(Observer ob) {
		obs.add(ob);
	}

	@Override
	public synchronized void deleteObserver(Observer ob) {
		int i = obs.indexOf(ob);
		if (i >= 0) {
			obs.remove(i);
		}
	}

	@Override
	public synchronized void deleteObservers() {
		obs.removeAll(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : obs){
		}
	}

	@Override
	public void notifyObservers(Object ob) {
		super.notifyObservers(ob);
	}

	@Override
	protected synchronized void setChanged() {
	}

}
