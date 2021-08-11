package testpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {
	
   
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Works Before All Test Case");
	}


	@AfterClass
	public static void afterClass() {
		System.out.println("Works After All Test Case");
	}

	
	
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}


	@After
	public void after() {
		System.out.println("After Test Case");
	}
	

	@Test
	public void test1() {
		System.out.println("In Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("In Test 2");
	}
	

}
