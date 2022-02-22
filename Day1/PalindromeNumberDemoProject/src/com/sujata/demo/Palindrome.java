package com.sujata.demo;

import com.sujata.training.Reverse;

public class Palindrome {

	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPalindorme() {
		findPalindromeStatus();
		return palindrome;
	}

	private void findPalindromeStatus() {
//		com.sujata.training.Reverse reverse=new com.sujata.training.Reverse();
		
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		if(number==reverse.getReverseNumber())
			palindrome=true;
		else
			palindrome=false;
	}
	
}
