package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eve")
public class GoodEvening implements Greet {

	private String name;

	public GoodEvening() {
		
	}
	public GoodEvening(@Value("Sean") String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evening "+name+" hope you had an awesome day!");

	}

}
