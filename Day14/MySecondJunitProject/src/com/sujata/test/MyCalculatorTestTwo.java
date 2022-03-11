package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.sujata.demo.MyCalculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Testing functions from MyCalculator Class")
class MyCalculatorTestTwo {

	private MyCalculator myCalculator;
	@BeforeEach

	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	
	@EnabledOnOs(value = {OS.LINUX,OS.MAC})
	@DisplayName("dividing 10 by 5")
	@Test
	void t001() throws NegativeNumberException {
		assertEquals(2, myCalculator.divide(10, 5));
	}
	
	@EnabledOnOs(value = OS.WINDOWS)
	@DisplayName("dividing -10 by 5")
	@Test
	void t002() {
		assertThrows(NegativeNumberException.class,()->myCalculator.divide(-10, 5));
	}

	@DisplayName("dividing 10 by -5")
	@Test
	void t003() {
		assertThrows(NegativeNumberException.class,()->myCalculator.divide(10, -5));
	}
	
	@Test
	void t004() {
		assertThrows(NegativeNumberException.class,()->myCalculator.divide(-10, -5));
	}
	
	@Test
	void t005() throws NegativeNumberException {
		assertEquals(0, myCalculator.divide(0, 10));
	}
	
	@Test
	void t006() {
		assertThrows(ArithmeticException.class,()->myCalculator.divide(10, 0));
	}
	
	@Test
	void t007() {
		assertThrows(NegativeNumberException.class,()->myCalculator.divide(-10, 0));
	}
	
}
