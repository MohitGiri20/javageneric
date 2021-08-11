package com.telstra.pack1;

import java.util.List;

public class Test {
	
	
	// UpperBound Number
	public static Number sumOfList(List<? extends Number> nlist) {
		
		double s = 0.0;
		
		for(Number num : nlist) {
		  s+=num.doubleValue();	
		}
		
		return s;
		
	}
	
	
	// LowerBound Number
	
	public static Number sumOfList1(List<? super Integer> nlist) {
		
		double d = 0.0;
		
		for(Object  o :nlist) {
			//d+= ((Double)o).doubleValue();
			d+= ((Integer)o).intValue();
		}
		
		return d;
	}

   public static Number sumOfList2(List<? super Double> nlist) {
		
		double d = 0.0;
		
		for(Object  o :nlist) {
			d+= ((Number)o).doubleValue();
			//d+= ((Integer)o).intValue();
		}
		
		return d;
	}
   
   
  // Unbounded examples work with object class methods;
   
   public static Number printList(List<?> list) {
	   
	   for(Object obj : list) {
		   System.out.println(obj);
	   }
	   return list.size();
   }
   
   public static <T extends Comparable<T>> T maximum(T x,T y, T z) {
	   
	   T max = x;
	   
	   if(y.compareTo(max) > 0) max = y;
	   
	   if(z.compareTo(max)>0) max = z;
	   
	   return max;
   }

}
