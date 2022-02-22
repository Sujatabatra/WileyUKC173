package com.sujata.demo;

public class MainPalindrome {

	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		palindrome.setNumber(123201);
		if(palindrome.isPalindorme())
			System.out.println("No and reverse no are same");
		else
			System.out.println("no and reverse no are not same");
	}

}
