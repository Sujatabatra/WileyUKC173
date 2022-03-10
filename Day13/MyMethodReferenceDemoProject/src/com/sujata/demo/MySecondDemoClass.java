package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

//method reference for instance methods
public class MySecondDemoClass {

	public static void main(String[] args) {

//		Consumer<String> consumerObject=name->System.out.println(name);
		Consumer<String> consumerObject=System.out::println;
		consumerObject.accept("Lili");
		
//		BiFunction<String, String, String> biFunctionObject=(str1,str2)->str1.concat(str2);
		
		BiFunction<String, String, String> biFunctionObject=String::concat;
		System.out.println(biFunctionObject.apply("Sujata", "Batra"));


	}

}
