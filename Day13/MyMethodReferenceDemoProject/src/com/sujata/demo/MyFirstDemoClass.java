package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

//Method Reference for static methods
public class MyFirstDemoClass {

	public static void main(String[] args) {
		
//		Function<String, Integer> obj=(n)->Integer.parseInt(n);
		
		Function<String, Integer> obj=Integer::parseInt;
		
		System.out.println(obj.apply("10"));

//		BiFunction<Double, Double, Double> ob=(number,po)->Math.pow(number, po);
		
		BiFunction<Double, Double, Double> ob=Math::pow;
		
		System.out.println(ob.apply(4.0, 3.0));
		
				

	}

}
