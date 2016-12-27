package com.arun.NewThinkTank;

public class RedBorderDecorator extends ShapeDecorator {

	public RedBorderDecorator(Shape shape) {
		super(shape);
		this.shape = shape;
	}
	
	public void draw(){
		shape.draw();
		setBorder();
	}

	public void setBorder() {
		System.out.println("Border :: Red");
	}

}
