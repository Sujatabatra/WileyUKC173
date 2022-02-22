package com.sujata.demo;

public class DemoClass {

	private int value1;
	private double value2;
	private String str;
	private boolean value3;
	
	public void show() {
		int i=0;
		System.out.println("i : "+i);
		System.out.println("Value 1: "+value1);
		System.out.println("Value 2: "+value2);
		System.out.println("Str : "+str);
		System.out.println("Value 3: "+value3);
	}
	
	public static void main(String[] args) {
		DemoClass obj=new DemoClass();
		obj.show();
		

	}

}
