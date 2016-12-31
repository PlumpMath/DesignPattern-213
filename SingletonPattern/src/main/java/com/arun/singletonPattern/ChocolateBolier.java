package com.arun.singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ChocolateBolier {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBolier instance;

	private ChocolateBolier() {
		this.empty = true;
		this.boiled = false;
	}

	public static ChocolateBolier getInstance() {
		if (instance == null) {
			synchronized (ChocolateBolier.class) {
				if (instance == null) {
					instance = new ChocolateBolier();
				}
			}
		}
		return instance;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void fill(int id) {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("filling..." + id);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void boil(int id) {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling..." + id);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void drain(int id) {
		if (isBoiled() && !isEmpty()) {
			empty = true;
			boiled = false;
			System.out.println("Draining..." + id);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void task(int id) {
		fill(id);
		boil(id);
		drain(id);
	}

	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(2);
		executors.submit(new Processor());
		try {
			executors.awaitTermination(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executors.shutdown();
	}
}

class Processor implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			ChocolateBolier choc = ChocolateBolier.getInstance();
			choc.task(i);
		}
	}

}
