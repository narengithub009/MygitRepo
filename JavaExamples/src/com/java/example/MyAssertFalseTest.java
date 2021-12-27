package com.java.example;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyAssertFalseTest {
	
	public boolean isEvenNumber(int num) {
		
		boolean result=false;
		
		if(num%2==0) {
			result=true;
		}
		
		return result;
	}
	@Test
	public void evenNumberTest() {
		MyAssertFalseTest assertFalseTest=new MyAssertFalseTest();
		assertTrue(assertFalseTest.isEvenNumber(4));
	}
}
