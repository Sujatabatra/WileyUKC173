package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedList is the duplicate ordered collection of element,
		 * which is autogrowable and autoshrinkable
		 */
		List<Integer> collection=new LinkedList<Integer>();
		
		System.out.println("Size of collection : "+collection.size());
		collection.add(10);
		collection.add(5);
		collection.add(17);
		collection.add(60);
		collection.add(45);
		collection.add(17);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(2);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Travesal Using List Iterator");
		ListIterator<Integer> listIterator=collection.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
