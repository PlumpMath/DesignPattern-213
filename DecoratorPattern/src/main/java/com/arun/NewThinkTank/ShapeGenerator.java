package com.arun.NewThinkTank;

public class ShapeGenerator {

	public static void main(String[] args) {

			Shape rectangle = new Rectangle();
			rectangle = new RedBorderDecorator(rectangle);
			rectangle = new BlueDecorator(rectangle);
			rectangle.draw();
			
			Shape square = new Square();
			square = new BlueDecorator(square);
			square.draw();
	}

}
