package com.sujata.demo;

/*
 * abstract : method and class
 * Rules 
 * 1. If a class have even single abstract method 
 * its mandatory for us to mark class also as abstract
 * 2. We can't instantiate abstract class , 
 * but we will be able to create the reference variable of abstract class
 * 3. abstract method don't have any body not even blank
 * 4. if the class have "N" abstract methods then
 * the child class must override all "N" abstract methods,
 * otherwise we need to mark child class also as abstract
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	abstract public void engine();
}
