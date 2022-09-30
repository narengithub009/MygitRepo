package com.java.demo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathsUtilityTest {

	@Test
	void test() {

		MathsUtility mathsUtility=new MathsUtility();
		int expected = 20;
		Integer actual= mathsUtility.add(10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void AssertNotEqualsTest() {
		MathsUtility mathsUtility=new MathsUtility();
		String expected="Narender1";
		String actual=mathsUtility.message("Narender");
		
		assertNotEquals(expected, actual,"Given String  are equals");
	}
	
	
	@Test
	void computeCircleAreaTest() {
		MathsUtility mathsUtility=new MathsUtility();
		assertEquals(314.1592653589793, mathsUtility.computeCircleArea(10));
	}
	
	@Test
	void assertThrowsEx() {
		
		MathsUtility mathsUtility=new MathsUtility();
		assertThrows(ArithmeticException.class, ()->mathsUtility.divide(10,8),"The number should divide with zero");
	}
}
