package com.arun.singletonPattern;

public class SingleTonPatternWithStaticFactoryMethod {
	private static final SingleTonPatternWithStaticFactoryMethod INSTANCE = new SingleTonPatternWithStaticFactoryMethod();

	private SingleTonPatternWithStaticFactoryMethod() {
	}

	public SingleTonPatternWithStaticFactoryMethod getInstance() {
		return INSTANCE;
	}
}
