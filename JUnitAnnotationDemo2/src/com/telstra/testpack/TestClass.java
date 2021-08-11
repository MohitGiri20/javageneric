package com.telstra.testpack;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.telstra.progpack.Counter;

public class TestClass {
	
	Counter counter1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		System.out.println("Object Instantiated");
	   
		counter1 = new Counter();
	
	}
	
	

	@After
	public void tearDown() throws Exception {
		System.out.println("Object Destroyed");
	
	counter1 = null;
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(counter1.increment() == 0);
		
	}

}
