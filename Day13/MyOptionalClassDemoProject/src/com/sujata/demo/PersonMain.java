package com.sujata.demo;

import java.util.Optional;

/*
 * Optional class methods
 * of()
 * ofNullable()
 * get()
 * ifPresent()
 * isPresent()
 */
public class PersonMain {

	public static void main(String[] args) {
		PersonService ps=new PersonService();
//		Person p=ps.getPerson(109);
//		System.out.println(p);
		
		Optional<Person> p=ps.getPerson(109);
		p.ifPresent(System.out::println);

		System.out.println(p.orElseGet(()->new Person(0,"No Name")));

	}

}
