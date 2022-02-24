package com.sujata.overriding;

// private < default < protected < public
/*
 * in overridden functions we can borader the scope of functions ,
 * but can't narrow down
 */
public class DerivedClass extends BaseClass {

	public void show() {
		System.out.println("Hi I am show method of DerivedClass!");
	}
	
	//informative annotation (optional annotation) : as per best practice , we should use it
	@Override
	public void display() {
		System.out.println("Hi I am display method of DerivedClass!");
	}
}
