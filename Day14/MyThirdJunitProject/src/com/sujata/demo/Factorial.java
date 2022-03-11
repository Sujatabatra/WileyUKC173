package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

/*
 * t001 : factorial of negative number : NegativeNumberException
 * t002 : factorial of zero : 1
 * t003 : factorial of 1 : 1
 * t004 : factorial of 4 : 24
 */
public class Factorial {

	private int number,factorial;

	public void setNumber(int number) throws NegativeNumberException{
		if(number<0)
			throw new NegativeNumberException("Negative Number Not Allowed");
		this.number = number;
	}

	public int getFactorial() {
		return factorial;
	}
	
	public void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
}
