package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(15,90,53,78,23,45);
		
//		list.stream().forEach(n->System.out.println(n));
		list.stream().forEach(System.out::println);

//		list.stream().forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		});
		
		System.out.println("======================");
		
		list.stream()
		.filter(element->element%2==0)    //intermediate
		.map(element->element+5)          //intermediate
		.forEach(System.out::println);   //terminate
		
		long totalValue=list.stream()
		.filter(element->element%2==0)   //Intermediate
		.count(); //terminate
		
		System.out.println("Total No fo Even Digits in list : "+totalValue);
		
//		Create the list of String and count the strings with length greater then 5
		
	}

}
