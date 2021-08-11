package com.telstra.testpack;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;




public class TestClass {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		int v1 = 5;
		int v2 = 10;
		
		// v1=> expected value, v2=>real value
		
		assertTrue(v1<v2);
		//assertFalse(v1<v2);
		
		//String s1 = new String("abc");
		//assertNull(s1);
		
		String s2 = "abc";
		String s3 = "abc";
		assertSame(s2, s3);
		
		String[] arr1 = {"Mg","Kg","Lg"};
		String[] arr2 = {"Mg","Kg","Lg"};
		
		//assertArrayEquals(arr1, arr2);
		
	}

}
