package com.sujata.demo;

public class ComplexMain {
	 
	
	public static void main(String[] args) {
//		Complex complex1=null;//declaraing reference variable
//		complex1=new Complex(); // creating object
//		
		Complex complex2;
//		System.out.println(complex2);
		complex2=new Complex(5);
		
		Complex complex3=new Complex(4, 8);
		
//		complex1.display();
		System.out.println("======================");
		System.out.println("Complex 2: "+complex2);
		complex2.display();
		System.out.println("=======================");
		complex3.display();

		Complex sum=complex2.sum(complex3);
		System.out.println("Sum of two Complex Nos : ");
		sum.display();
	}

}
