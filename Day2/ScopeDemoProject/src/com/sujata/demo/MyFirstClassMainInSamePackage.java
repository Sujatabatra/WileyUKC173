package com.sujata.demo;

public class MyFirstClassMainInSamePackage {

	public static void main(String[] args) {
		MyFirstClass myFirstClass=new MyFirstClass();
		
		//Different class and Same Package
		myFirstClass.methodTwo();
		myFirstClass.methodThree();
		myFirstClass.methodFour();
		
		MySecondClass mySecondClass=new MySecondClass();

	}

}
