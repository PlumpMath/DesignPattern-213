package com.arun.singletonPatternBreak;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.arun.singletonPattern.SingletonWithLazyLoading;

public class LazyLoadingVreakUp {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonWithLazyLoading instanceOne = SingletonWithLazyLoading.getInstance();
		SingletonWithLazyLoading instanceTwo = null;
		
		//Reflection can break Singleton pattern
		
		@SuppressWarnings("unchecked")
		Constructor<SingletonWithLazyLoading>[] constructors = (Constructor<SingletonWithLazyLoading>[]) SingletonWithLazyLoading.class.getDeclaredConstructors();
		
		for(Constructor<SingletonWithLazyLoading> constructor : constructors){
			constructor.setAccessible(true);
			instanceTwo = constructor.newInstance();
			break;
		}
		
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		/*o/p will be different 
		366712642
		1829164700*/
	}

}
