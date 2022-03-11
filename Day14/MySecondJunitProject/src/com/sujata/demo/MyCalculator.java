package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class MyCalculator {

	/*
	 * divide two positive numbers
	 */
	public int divide(int number1,int number2) throws NegativeNumberException {
		
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Negative Numbers not allowed");
		
	}
	
	/*
	 * addition of two positive integers
	 */
	public int sum(int number1,int number2) {
		return 0;
	}
}
