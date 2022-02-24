package com.sujata.demo;

/*
 * final : variable, method, class
 * if the variable is final : we won't be able to change the value of final variable
 * if the method is final : we won't be able to override the method
 * if class is final : we won't be able to extend that class
 */
/*final*/ public class Base {

	private int x;
	final private int y=5;
	
	public void change() {
		x=10;
//		y=20;
	}
	
	public void display() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	public final void show() {
		System.out.println("Hi I am show method from Base class");
	}
}
