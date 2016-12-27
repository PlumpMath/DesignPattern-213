package com.arun.NewThinkTank;

public class BlueDecorator extends ShapeDecorator{

	public BlueDecorator(Shape shape) {
		super(shape);
		this.shape = shape;
	}
	
	public void draw(){
		shape.draw();
		setBorder();
	}
	
	void setBorder(){
		System.out.println("Border :: Blue");
	}

}
