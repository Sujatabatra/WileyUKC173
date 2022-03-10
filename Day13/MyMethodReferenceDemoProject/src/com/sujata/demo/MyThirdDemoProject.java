package com.sujata.demo;
//method reference for constructor call
class Person{
	private int personId;
	private String personName;
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
}

interface PersonFactory{
	public Person getPerson(int pId,String pName);
}
public class MyThirdDemoProject {

	public static void main(String[] args) {
//		PersonFactory personFactory=(pId,pName)-> new Person(pId,pName);
		PersonFactory personFactory=Person::new;
		
		System.out.println(personFactory.getPerson(101, "AAAAA"));

	}

}
