package com.arun.singletonPattern;

public class SingleTonPatternWithStaticFactoryMethod {
	
	/* This is eager initialization */
	
	private static final SingleTonPatternWithStaticFactoryMethod INSTANCE = new SingleTonPatternWithStaticFactoryMethod();

	private SingleTonPatternWithStaticFactoryMethod() {
	}

	public static SingleTonPatternWithStaticFactoryMethod getInstance() {
		return INSTANCE;
	}
}
