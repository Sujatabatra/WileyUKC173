package com.sujata.demo;
/*
 * 1. Constructor name must be same as that of your class name
 * 2. Constructor cannot return any value not even void
 * 3. Constructor can be argumented as well as non argumented
 * 4. Constructor can exist in any Scope ( private, default,protected, public)
 * 5. If our class is constructor challenged, then compiler will going to create
 * default constructor for our class, default constructor means zero argument constructor
 * 6. Default constructor intialise all instance variables with default initial values
 * (byte, short, int and long=0 ; float and double =0.0, boolean = false , objects =null, character=/u0000)
 * 7. In single class we can have multiple constructor and 
 * each constructor will get differentiated from each other as per signature,
 * signature means number and types of its arguments and its sequence (Constructor Overloading)
 */
public class Complex {
	
	private int real,imagenary;

	
	public Complex(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
	
	public Complex(int real) {
		this.real = real;
	}
	
	private Complex() {
	}
	

	public void display() {
		System.out.print(real);
		if(imagenary>0)
			System.out.println("+"+imagenary+"i");
		else if(imagenary<0)
			System.out.println(imagenary+"i");
	}
	
	public Complex sum(Complex complex2) {
		
		Complex sumComplex=new Complex();
		
		sumComplex.real=real+complex2.real;
		sumComplex.imagenary=imagenary+complex2.imagenary;
		
		return sumComplex;
	}
}
