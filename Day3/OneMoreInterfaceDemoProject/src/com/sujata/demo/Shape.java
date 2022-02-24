package com.sujata.demo;

public interface Shape {

	public void area();
	
	default public void perimeter() {
		System.out.println("This shape does not support perimeter");
	}
	
	default public void circumference() {
		System.out.println("This shape does not support circumference");
	}
}
