package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class MySecondDemoClass {
	
	public static void main(String args[]) {
		List<Dish> dishes=new ArrayList<Dish>();
		dishes.add(new Dish("Paneer", true, 450, 50));
		dishes.add(new Dish("Chicken", false, 550, 250));
		dishes.add(new Dish("Fish", false, 350, 350));
		dishes.add(new Dish("Potato Curry", true, 750, 150));
		
		dishes.stream()
		.filter(dish->dish.getCalorie()>500)
		.forEach(System.out::println);
		
	}

}
