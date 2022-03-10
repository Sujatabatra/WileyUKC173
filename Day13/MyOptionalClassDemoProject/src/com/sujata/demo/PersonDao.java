package com.sujata.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonDao {

	private static Map<Integer, Person> personList=new HashMap<>();
	
	static{
		personList.put(101, new Person(101,"AAAA"));
		personList.put(102, new Person(102,"BBBB"));
		personList.put(103, new Person(103,"CCCC"));
		personList.put(104, new Person(104,"DDDD"));
		personList.put(105, new Person(105,"EEEE"));
	}
	
//	public Person getPersonById(int id){
//		Person person=personList.get(id);
//		return person;
//	}
	
	public Optional<Person> getPersonById(int id){
		Person person=personList.get(id);
		Optional<Person> per=Optional.ofNullable(person);
		return per;
	}
	
}

