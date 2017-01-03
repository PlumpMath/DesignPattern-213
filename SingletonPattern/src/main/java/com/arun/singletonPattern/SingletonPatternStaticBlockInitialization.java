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

	public static SingletonPatternStaticBlockInitialization getInstance() {
		return INSTANCE;
	}
}
