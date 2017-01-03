package com.arun.singletonPattern;

public class BillPughSingleton {

	private BillPughSingleton() {

	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
