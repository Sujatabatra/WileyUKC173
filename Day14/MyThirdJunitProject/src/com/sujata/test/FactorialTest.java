package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Factorial;
import com.sujata.exception.NegativeNumberException;

class FactorialTest {

	private Factorial factorial;

	@BeforeEach
	void setUp() throws Exception {
		factorial = new Factorial();
	}

	@AfterEach
	void tearDown() throws Exception {
		factorial = null;
	}

	@Test
	void t001() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, () -> factorial.setNumber(-5));
	}

	@Test
	void t002() throws NegativeNumberException {
		factorial.setNumber(0);
		factorial.calculateFactorial();
		assertEquals(1, factorial.getFactorial());
	}

	@Test
	void t003() throws NegativeNumberException {
		factorial.setNumber(1);
		factorial.calculateFactorial();
		assertEquals(1, factorial.getFactorial());
	}

	@Test
	void t004() throws NegativeNumberException {
		factorial.setNumber(4);
		factorial.calculateFactorial();
		assertEquals(24, factorial.getFactorial());
	}

}
