package com.telstra.testpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.telstra.pack1.EvenOddClass;

public class EvenTest {

	@Test
	public void test() {
		
		EvenOddClass obj = new EvenOddClass();
		
		assertEquals(true, obj.isEven(12));
		//fail("Not yet implemented");
	}

}
