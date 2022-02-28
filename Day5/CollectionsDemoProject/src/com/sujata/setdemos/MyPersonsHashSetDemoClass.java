package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyPersonsHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Unique unordered collection of objects,
		 * which are autogrowable and autoshrinkable
		 */
		Set<Person> collection=new HashSet<Person>();
		
		System.out.println("Size of collection : "+collection.size());
		collection.add(new Person(101, "AAA"));
		collection.add(new Person(102, "BBB"));
		collection.add(new Person(103, "CCC"));
		collection.add(new Person(104, "DDD"));
		collection.add(new Person(105, "EEE"));
		collection.add(new Person(101, "AAA"));
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(50);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Iterating using for each");
		for(Person element:collection) {
			System.out.println(element);
		}
		System.out.println("Traversal using Iterator Interface");
		//Factory Design Pattern : getting the object without using new and without knowing the name of implementation class
		Iterator<Person> iterator=collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			
		
	}

}
