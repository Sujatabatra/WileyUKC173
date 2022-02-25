package com.sujata.demo;

import java.util.Scanner;

public class MainForAgeInputByThrowingCheckedException {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		AgeInputByThrowingCheckedException obj=new AgeInputByThrowingCheckedException();
		
		System.out.println("Enter Age : ");
		int a=scanner.nextInt();
		
		try {
			obj.setAge(a);
			System.out.println("Person is eligible for employement");
		} catch (AgeCheckedException e) {
			System.out.println("Person is not eligible for employement");
		}
		
		obj.oneMoreSetAge(a);
		

	}

}
