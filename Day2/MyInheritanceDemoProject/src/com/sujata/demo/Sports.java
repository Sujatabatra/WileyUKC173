package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;
	
	public void input(int rollNo,String name,String sportsName) {
		input(rollNo, sportsName);
		this.sportsName=sportsName;
	}
	
	public void displayStudentWithSportsDetails() {
		displayStudent();
		System.out.println("Sports Name : "+sportsName);
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	
	
}
