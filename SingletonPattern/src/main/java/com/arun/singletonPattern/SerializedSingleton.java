package com.arun.singletonPattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4707756826055263165L;

	private SerializedSingleton() {
	}

	private static class Helper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return Helper.instance;
	}

}


