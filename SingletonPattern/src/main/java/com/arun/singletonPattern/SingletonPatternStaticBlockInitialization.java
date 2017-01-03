package com.arun.singletonPattern;

public class SingletonPatternStaticBlockInitialization {

	private static SingletonPatternStaticBlockInitialization INSTANCE;

	private SingletonPatternStaticBlockInitialization() {
	}

	static {
		try {
			INSTANCE = new SingletonPatternStaticBlockInitialization();
		} catch (Exception e) {
			new RuntimeException();
		}
	}

	public SingletonPatternStaticBlockInitialization getInstance() {
		return INSTANCE;
	}
}
