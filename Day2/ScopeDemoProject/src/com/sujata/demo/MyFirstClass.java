package com.sujata.demo;

public class MyFirstClass {

	private void methodOne() {
		System.out.println("Hi I am private scope methodOne() from com.sujata.demo.MyFirstClass");
	}
	
	void methodTwo() {
		System.out.println("Hi I am default scope methodTwo() from com.sujata.demo.MyFirstClass");
	}
	
	protected void methodThree() {
		System.out.println("Hi I am protected scope methodThree() from com.sujata.demo.MyFirstClass");
	}
	
	public void methodFour() {
		System.out.println("Hi I am public scope methodFour() from com.sujata.demo.MyFirstClass");
	}
	
	private void someDummyMethod() {
		MyFirstClass myFirstClass=new MyFirstClass();
		myFirstClass.methodOne();
		myFirstClass.methodTwo();
		myFirstClass.methodThree();
		myFirstClass.methodFour();
	}
}
