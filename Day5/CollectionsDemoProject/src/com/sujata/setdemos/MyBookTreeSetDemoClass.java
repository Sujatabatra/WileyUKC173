package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyBookTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Unique sorted collection of objects,
		 * which are autogrowable and autoshrinkable
		 */
		Set<Book> collection=new TreeSet<Book>(new SoryByNoOfPages());
		
		System.out.println("Size of collection : "+collection.size());
		collection.add(new Book(111, "Book1 ", "Mr. A", 1000, 500));
		collection.add(new Book(222, "Book2 ", "Mr. B", 4100, 600));
		collection.add(new Book(333, "Book3 ", "Mr. A", 1800, 5100));
		collection.add(new Book(444, "Book4 ", "Mr. B", 2000, 800));
		collection.add(new Book(555, "Book5 ", "Mr. A", 3000, 1500));
		collection.add(new Book(111, "Book1 ", "Mr. A", 1000, 500));
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
//		collection.remove(50);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Iterating using for each");
		for(Book element:collection) {
			System.out.println(element);
		}
		System.out.println("Traversal using Iterator Interface");
		//Factory Design Pattern : getting the object without using new and without knowing the name of implementation class
		Iterator<Book> iterator=collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			
		
	}

}
