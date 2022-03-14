package com.sujata.objectio;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -6553034436181567300L;
	
	private int pId;
	private String personName;
	private int personAge;
	private String address;

	public Person() {

	}

	public Person(int pId, String personName, int personAge) {
		super();
		this.pId = pId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public Person(int pId, String personName) {
		super();
		this.pId = pId;
		this.personName = personName;
		this.personAge=0;
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

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", personName=" + personName + ", personAge=" + personAge + ", address=" + address
				+ "]";
	}
	
	

}
