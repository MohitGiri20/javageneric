package com.telstra.pack1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		MyFunction myFunction = (n1,n2)->{
//			return n1+n2;
//		};
//		System.out.println(myFunction.apply(10,20));
//	}

//	
//	Function<Integer,Long> f1 = new Class1();
//    
//	System.out.println(f1.apply(5));
//	
//	Function<Integer,Long> f2 = (n) -> (long)n + 3L;
//	
//	System.out.println(f2.apply(5));
//	
		
		
//		Predicate<Object> fp = new Class2();
//		System.out.println(fp.test(12));
//		
//		
//		Predicate<Double> fp2 = (d)-> d<100;
//		Predicate<Double> fp3 = (d)-> d>=75;
//		
//		System.out.println("Enter percentage:");
//		double percentage = scn.nextDouble();
//		
//		if(fp2.and(fp3).test(percentage)) {
//			System.out.println("Distinction");
//		}else {
//			System.out.println("Pass");
//		}
//		
//		System.out.println(fp2.and(fp3).negate().test(80.0));
		
		
		
//		Predicate<RevNum> prevnum = (revnum) -> revnum.getNum() == revnum.getRevNum();
//		
//		System.out.println(prevnum.test(new RevNum(1251)));
//		
//        Predicate<PalindromeString> prevString = (revString) -> revString.getString()==revString.getRevString();
//		
//		System.out.println(prevString.test(new PalindromeString("mohit")));
//		
		
//		Predicate<User> fuser = (u) -> u.getRole().equalsIgnoreCase("Admin");
//		
//		ArrayList<User> users = new ArrayList<User>();
//		
//		users.add(new User(101,"Mg","Admin"));
//		users.add(new User(102,"Kg","Member"));
//		users.add(new User(103,"Lg","Admin"));
//		users.add(new User(104,"Pg","Admin"));
//		users.add(new User(105,"Sg","Member"));
//		
//		
//		ArrayList<User> res = getAdmins(users,fuser);
//		
//		for(User u : res) {
//			System.out.println(u);
//		}
		
		
	Function<Integer,Integer> multi = (val) -> val*2;
	Function<Integer,Integer> add = (val) -> val + 4;
	
	Function<Integer,Integer> addThenMultiply = multi.compose(add);
	System.out.println(addThenMultiply.apply(2));
	
	Function<Integer,Integer> multiplyThenAdd = multi.andThen(add);
	System.out.println(multiplyThenAdd.apply(2));
	
	// Bitwise Operator
	UnaryOperator<Integer> xor = (a) -> a^1;
	
	System.out.println(xor.apply(2));
	
	UnaryOperator<Integer> and = (a) -> a & 1;
	Function<Integer,Integer> res = xor.compose(and);
	System.out.println(res.apply(2));
	
	Function<Integer,Integer> res1 = xor.andThen(and);
	System.out.println(res1.apply(3));
	
	
	// Predicate pass as a function is greater as a function and get whether the passed value is greater
	// than 15.
	
	
	Predicate<Integer> fp4 = (i) -> i>10;
	System.out.println(isGreater(15,fp4));
		
}
	
	
	public static boolean isGreater(int num , Predicate<Integer> p) {
		
		return (p.test(num) == true ? true : false); 
	}
	
	public static ArrayList<User> getAdmins(ArrayList<User> users, Predicate<User> p){
		
		ArrayList<User> res = new ArrayList<User>();
		
		for(User u : users) {
			if(p.test(u))
				res.add(u);
		}
		
		return res;
	}
	
}
