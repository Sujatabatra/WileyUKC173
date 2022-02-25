package com.sujata.demo;

public class AgeInputByThrowingCheckedException {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeCheckedException {
		if(age<18)
			throw new AgeCheckedException("Age must be >18");
		this.age = age;
	}
	
	public void oneMoreSetAge(int age){
		try {
		if(age<18)
			throw new AgeCheckedException("Age must be >18");
		this.age = age;
		}
		catch(AgeCheckedException ex) {
			System.out.println(ex.getMessage());
			
		}
	}
}
