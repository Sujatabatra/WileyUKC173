package com.sujata.misc;

class Person{
	private int pId;
	private String personName;
	public Person(int pId, String personName) {
		super();
		this.pId = pId;
		this.personName = personName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", personName=" + personName + "]";
	}
	
	
	
}
class InputInteger{
	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}

class InputString{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class InputPerson{
	private Person value;

	public Person getValue() {
		return value;
	}

	public void setValue(Person value) {
		this.value = value;
	}	
	
}

class GenericInput<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
public class MyGenericDemoClass {

	public static void main(String[] args) {
		GenericInput<String> gOb1=new GenericInput<String>();
		gOb1.setValue("Sujata");
		
		GenericInput<Person> gOb2=new GenericInput<Person>();
		gOb2.setValue(new Person(111,"AAA"));
		Person p=gOb2.getValue();
		System.out.println(p/*.toString()*/);

	}

}
