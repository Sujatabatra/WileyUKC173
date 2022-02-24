package com.sujata.demo;

class MyBase{
	//instance block
	{
		System.out.println("Hi I am instance block from MyBase");
	}
	
	static {
		System.out.println("Hi I am static block from MyBase");
	}
	MyBase(){
		System.out.println("Hi I am MyBase Constructor");
	}
}

class MyDerive extends MyBase{
	//instance block
	{
		System.out.println("Hi I am instance block from MyDerive");
	}
	
	static {
		System.out.println("Hi I am static block from MyDerive");
	}
	MyDerive(){
		System.out.println("Hi I am MyDerive Constructor");
	}
}

public class MyThirdStaticDemoClass {

	public static void main(String[] args) {
		MyBase bOb1=new MyBase();
		System.out.println("===================");
		
		MyDerive dOb1=new MyDerive();  //6,13,20,27      //24,6,13,20,27
		//10,24,6,13,20,27
//		MyDerive dOb1=new MyDerive();  
//		System.out.println("===================");
//		MyBase bOb1=new MyBase();
		
//		MyBase bOb2=new MyBase();
//		
//		MyBase bOb3=new MyBase();
		
		
	}

}
