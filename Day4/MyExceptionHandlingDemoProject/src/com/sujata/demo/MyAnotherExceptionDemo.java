package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyAnotherExceptionDemo {

	public static void divide(int number1, int number2) {
		try {
			int result = number1 / number2;
			System.out.println("Division Result : " + result);
			System.out.println("Good Bye from Try Block");
		} 
//			catch (NullPointerException ex) {
//			System.out.println("Oh got null pointer exception");
//		} 
		finally {
			System.out.println("Hi I am finally Block");
		}
		System.out.println("Good Bye from Divide Method");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter First No : ");
		int no1 = scanner.nextInt();
		System.out.println("Enter Second No : ");
		int no2 = scanner.nextInt();

		divide(no1, no2);
		}
		catch(InputMismatchException ex) {
			System.out.println("Kindly enter integer values");
		}
		catch (ArithmeticException e) {
			System.out.println("Undefined");
		}
		System.out.println("Good Bye from Main");

	}

}
