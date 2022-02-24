package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int location=-1;
		try {
		System.out.println("Enter First No : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		
		int result=number1/number2;
		
		System.out.println("Division Result : "+result);
		
		int arr[];
		System.out.println("Enter Size of an array : ");
		int size=scanner.nextInt();
		arr=new int[size];
		for(int index=0;index<size;index++) {
			System.out.println("Enter "+(index+1)+" element : ");
			arr[index]=scanner.nextInt();
		}
		
		System.out.println("Enter the location in an array whoes value you want to view : ");
		location=scanner.nextInt();
		System.out.println("Value at "+location+" location : "+arr[location]);
		}
		catch(ArithmeticException exception) {
			System.out.println("Undefined");
		}
//		catch(Exception exception) {
//			System.out.println("Something went wrong please try after sometime");
//		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("location "+location+" is not in an array");
		}
		catch(NegativeArraySizeException exception) {
			System.out.println("Array Size cannot be negative, please enter some positive integer");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong please try after sometime");
		}
		System.out.println("Good Bye from Main");

	}

}
