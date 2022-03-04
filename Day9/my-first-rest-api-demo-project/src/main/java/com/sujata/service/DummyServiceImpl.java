package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {

	@Override
	public String greet() {
		
		return "<h1>Hello , from First Rest API!</h1>";
	}

	@Override
	public int sum(int number1, int number2) {
		
		return number1+number2;
	}

}
