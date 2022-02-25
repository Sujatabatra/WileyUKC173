package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Unique sorted collection of objects,
		 * which are autogrowable and autoshrinkable
		 */
		Set<Integer> collection=new TreeSet<Integer>();
		
		System.out.println("Size of collection : "+collection.size());
		collection.add(10);
		collection.add(5);
		collection.add(50);
		collection.add(78);
		collection.add(42);
		collection.add(78);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(50);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Iterating using for each");
		for(Integer element:collection) {
			System.out.println(element);
		}
		System.out.println("Traversal using Iterator Interface");
		//Factory Design Pattern : getting the object without using new and without knowing the name of implementation class
		Iterator<Integer> iterator=collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			
		
	}

}
