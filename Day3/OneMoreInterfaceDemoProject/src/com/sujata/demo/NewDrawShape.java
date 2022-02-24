package com.sujata.demo;

public class NewDrawShape extends DrawShape {

	public NewDrawShape(Shape shape) {
		super(shape);
		
	}
	
	@Override
	public void showStats() {
		getShape().area();
		getShape().perimeter();
		getShape().circumference();
	}

}
