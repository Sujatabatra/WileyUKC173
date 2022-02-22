package com.sujata.demo;

public class MyModularDemoClass {

/*
 * ignore static for current demo : asz we are trying to portrait modular behaviour 
 * from OOP Language
 */
	static int number, factorial;
	
	static void inputNumber(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	
	public static void main(String[] args) {
		inputNumber(4);
		calculateFactorial();
		//Logical Error
		factorial=9;
		displayFactorial();

	}

}
