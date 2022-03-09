package com.sujata.demo;

public class FoodMall {

	public static void main(String[] args) {
		PopCorn popCorn=new PopCorn();
		popCorn.pop();
		
		PopCorn butterPopCorn=new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Butterly PopCorn Popping");
			}
		};

		butterPopCorn.pop();
		
		Shape rect=new Shape() {
			
			@Override
			public void area() {
				System.out.println("Hi I am Rectangle Area!");
				
			}
		};
		
		rect.area();
	}

}
