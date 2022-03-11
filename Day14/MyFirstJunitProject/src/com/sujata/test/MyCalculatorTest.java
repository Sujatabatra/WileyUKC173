package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * @BeforeAll
 * 
 * @BeforeEach
 * @Test
 * @AfterEach
 * 
 * @BeforeEach
 * @Test
 * @AfterEach
 * 
 * @AfterAll
 */
class MyCalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass Method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass Method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp Method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown Method");
	}

	@Test
	void testDivide1() {
		System.out.println("Test Case One");
	}
	
	@Test
	void testDivide2() {
		System.out.println("Test Case Two");
	}

}
