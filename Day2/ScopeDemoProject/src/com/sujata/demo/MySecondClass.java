package com.sujata.demo;

class MySecondClass {

	private void methodOne() {
		System.out.println("Hi I am private scope methodOne() from com.sujata.demo.MySecondClass");
	}
	
	void methodTwo() {
		System.out.println("Hi I am default scope methodTwo() from com.sujata.demo.MySecondClass");
	}
	
	protected void methodThree() {
		System.out.println("Hi I am protected scope methodThree() from com.sujata.demo.MySecondClass");
	}
	
	public void methodFour() {
		System.out.println("Hi I am public scope methodFour() from com.sujata.demo.MySecondClass");
	}
	
	public void dummy() {
		MySecondClass mySecondClass=new MySecondClass();
		
	}
}
