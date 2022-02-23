package com.sujata.training;

import com.sujata.demo.MyFirstClass;

public class MyFirstClassMainInDifferentPackage {

	public static void main(String[] args) {
		MyFirstClass myFirstClass=new MyFirstClass();
		
		//Different class Different Package
		myFirstClass.methodFour();
		
//		MySecondClass mySecondClass=new MySecondClass();

	}

}
