package com.arun.NewThinkTank;

public class Application {

	public static void main(String[] args) {
		StockGrabber sg = new StockGrabber();
		StockObserver st1 = new StockObserver(sg);
		sg.setIBMPrice(100.00);
		sg.setGoogPrice(500);
		sg.setAaplePrice(340);
		StockObserver st2 = new StockObserver(sg);
		sg.setIBMPrice(10.00);
		sg.setGoogPrice(40);
		sg.setAaplePrice(34);
		sg.removeObserver(st1);
		sg.setIBMPrice(12.00);
		sg.setGoogPrice(50);
		sg.setAaplePrice(1);
	}

}
