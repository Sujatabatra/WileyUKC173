package com.sujata.demo;

public class DrawShape {

	private Shape shape;

	public DrawShape(Shape shape) {
		super();
		this.shape = shape;
	}
	
	public void showStats() {
		shape.area();
	}

	public Shape getShape() {
		return shape;
	}
	
	
}
