package com.sujata.demo;

import java.util.Optional;

public class PersonService {
	
	private PersonDao personDao=new PersonDao();
	
	public Optional<Person> getPerson(int id){
		Optional<Person> person=personDao.getPersonById(id);
		Person p1=null;
		if(person.isPresent())
			p1=convertLowerCase(person.get());
		return Optional.ofNullable(p1);
	}

//	public Person getPerson(int id){
//		Person person=personDao.getPersonById(id);
//		Person p1=convertLowerCase(person);
//		return p1;
//	}
	
	public Person convertLowerCase(Person person){
		person.setpName(person.getpName().toLowerCase());
		return person;
	}
}
