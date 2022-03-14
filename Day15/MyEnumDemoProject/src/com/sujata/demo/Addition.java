package com.sujata.demo;

/*
 * 1. Method can have only one variable argument
 * 2. Method can have one variable argument and any number of fixed arguments together but
 * variable argument must be the last argument in the argument list
 */
public class Addition {

	public int sum(int... args) {
		for(int element:args) {
			System.out.println(element);
		}
		return 0;
	}
	
	public int getLowest(int... arg) {
		return 0;
	}
	public void show(String str,int x,int... arg) {
		
	}
	
	public void show(String str,int... arg) {
		
	}
	
//	public void display(int... arg,String str) {
//		
//	}
	public static void main(String[] args) {
		Addition ob=new Addition();
		ob.sum();
		System.out.println("===============");
		ob.sum(10,20);
		System.out.println("=====================");
		ob.sum(1,2,3,4,5,6);

		ob.getLowest(34,12,67,45,2,90);
	}

}
