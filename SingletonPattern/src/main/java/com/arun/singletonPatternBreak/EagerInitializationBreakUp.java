package com.arun.singletonPatternBreak;

import java.lang.reflect.Constructor;

import com.arun.singletonPattern.SingleTonPatternWithStaticFactoryMethod;

public class EagerInitializationBreakUp {

	public static void main(String[] args) {
		SingleTonPatternWithStaticFactoryMethod instanceOne = SingleTonPatternWithStaticFactoryMethod.getInstance();
		SingleTonPatternWithStaticFactoryMethod instanceTwo = null;

		try {
			@SuppressWarnings("unchecked")
			Constructor<SingleTonPatternWithStaticFactoryMethod>[] constuctors = (Constructor<SingleTonPatternWithStaticFactoryMethod>[]) SingleTonPatternWithStaticFactoryMethod.class
					.getDeclaredConstructors();
			
			
			for(Constructor<SingleTonPatternWithStaticFactoryMethod> constructor : constuctors){
				constructor.setAccessible(true);
				instanceTwo = constructor.newInstance();
				break;
			}
			
			System.out.println(instanceOne.hashCode());
			System.out.println(instanceTwo.hashCode());
			
			/*o/p of hashcode
			
			366712642
			1829164700*/

		} catch (Exception e) {

		}
	}

}
