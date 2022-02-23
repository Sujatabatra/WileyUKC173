package com.sujata.demo;

public class MainPopCorn {

	public static void main(String[] args) {
		/*
		 * Base class reference Variable is Type Compatible with derived class
		 * Dynamic Method Dispatch :
		 * 
		 */
		
		PopCorn baseReferenceVariable;  //reference variable
		
		baseReferenceVariable=new PopCorn();  //object creation
		baseReferenceVariable.pop();
		
		baseReferenceVariable=new ButterPopCorn();  //object creation
		baseReferenceVariable.pop();
		
		baseReferenceVariable=new CaramelPopCorn();  //object creation
		baseReferenceVariable.pop();

	}

}
