package com.arun.headfirstexample;

public class Main {

	public static void main(String[] args) {

		// from head first design pattern
		Duck duck = new MallardDuck();
		duck.fly();
		duck.swim();

		duck = new RubberDuck();
		duck.fly();
		duck.swim();

		/*
		 * new removed totally from implementation. we can make the Indian duck
		 * fly or cannot fly as per the parameter passed
		 */
		duck = new IndianDuck();
		duck.setName("Indian Duck");
		duck.setFlyBehaviour(new FlyWithWings());
		duck.fly();
		duck.swim();

		/* the same indian duck can be made cannot fly with a different name */
		System.out.println("Indian Wooden Duck");
		duck = new IndianDuck();
		duck.setName("Indian Wooden Duck");
		duck.setFlyBehaviour(new Cannotfly());
		duck.fly();
		duck.swim();

	}

}
