package com.sujata.demo;
/*
 * data to be readable : getter
 * data to be modfiable : setter
 */
class Factorial{
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
}
public class MyObjectOrientedDemoClass {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		factorial.setNumber(4);
		System.out.println("Factorial : "+factorial.getFactorial());
		

	}

}
