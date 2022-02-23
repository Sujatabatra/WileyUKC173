package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		BMW bmw=new BMW("Q5", "Blue");
		Audi audi=new Audi("A8", "Red");
		Toyota toyota=new Toyota("Altis", "Golden");
		
		Driver john=new Driver("John");
		Driver ronny=new Driver("Ronny");
		
		john.setCar(toyota);
		john.drive();

	}

}
