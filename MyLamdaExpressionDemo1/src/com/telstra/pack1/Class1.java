package com.telstra.pack1;

import java.util.function.Function;

public class Class1 implements Function<Integer,Long>{

	@Override
	public Long apply(Integer t) {
		// TODO Auto-generated method stub
		
		Long res = (long)t + 15L;
		return res;
	}
	
	

}
