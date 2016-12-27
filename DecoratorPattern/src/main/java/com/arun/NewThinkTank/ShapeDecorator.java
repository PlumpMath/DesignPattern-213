package com.arun.NewThinkTank;

public abstract class ShapeDecorator implements Shape{
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}
}
