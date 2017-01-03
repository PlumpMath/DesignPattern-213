package com.arun.singletonPattern;

public class SingletonWithLazyLoading {

	// This is Lazy loading or double checking

	private volatile static SingletonWithLazyLoading INSTANCE;

	private SingletonWithLazyLoading() {

	}

	public SingletonWithLazyLoading getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonWithLazyLoading.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonWithLazyLoading();
				}
			}
		}
		return INSTANCE;
	}
}
