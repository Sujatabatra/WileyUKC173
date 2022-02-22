package com.sujata.training;

public class Reverse {

	private int number,reverseNumber;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverseNumber() {
		calculateReverse();
		return reverseNumber;
	}
	
	private void calculateReverse() {
		reverseNumber=0;
		while(number>0) {
			int remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number=number/10;
		}
	}
	
}
