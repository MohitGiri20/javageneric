package com.telstra.pack1;

import java.util.function.Predicate;

public class Class2 implements Predicate<Object>{

	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		
		Integer i = (Integer)t;
		return (i<18);
	}
	
	
	
	
	
	

}
