package com.sujata.misc;


public class MyDemoEquals {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i==j) {
			System.out.println("Both i and j are equal");
		}
		else {
			System.out.println("Both i and j are not equal");
		}

		Employee e1=new Employee(101, "AAAA", "Sales", "25000");
		Employee e2=new Employee(101, "AAAA", "Sales", "25000");
		
		//e1 and e2 are refering to same object or not
		if(e1==e2)
			System.out.println("Both e1 and e2 are same");
		else
			System.out.println("e1 and e2 are not same");
		
		//if two object are meaningfully equal , then their hashcode must also be same
		//but if two objects have same hashcode, they might not be meaningfully equal
		if(e1.equals(e2))
			System.out.println("e1 and e2 are same");
		else
			System.out.println("e1 and e2 are not same");
		
		System.out.println(" e1 : "+e1);
		System.out.println(" e2 : "+e2);
		
		
		Employee e3=e2;
		if(e3==e2)
			System.out.println("Both e3 and e2 are same");
		else
			System.out.println("e3 and e2 are not same");
	}

}
