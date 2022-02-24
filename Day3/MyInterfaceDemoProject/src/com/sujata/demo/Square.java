package com.sujata.demo;

public class Square extends Input implements NonRoundedShape {

	private int area,perimeter;
	
	public Square(int side) {
		setValue(side);
	}
	@Override
	public void area() {
		area=getValue()*getValue();

	}

	@Override
	public void show() {
		System.out.println("Area  of Square : "+area);
		System.out.println("Perimeter of Square : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=4*getValue();

	}

}
