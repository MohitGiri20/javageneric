package com.telstra;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s = new HashSet();
		
		
		s.add(1);
		s.add("mg");
		s.add(12.5);
		s.add(null);
		System.out.println(s);
		
		// Not follow insertion order
		
		HashSet<String> s1 = new HashSet<String>();
		
		s1.add(null);
		s1.add("mg");
		s1.add("mohit");
		s1.add("giri");
		//s1.add("mg");
		
		System.out.println(s1);
		
		
		// Follows the insertion order (LinkedHashSet)
		
		LinkedHashSet<String> s2 = new LinkedHashSet<String>();
		
		s2.add("a");
		s2.add("b");
		s2.add("z");
		s2.add("i");
		s2.add("e");
		
		System.out.println(s2);
		
		
		// Sorted set is tree set(Follows the sorted order);
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("a");
		ts.add("b");
		ts.add("z");
		ts.add("i");
		ts.add("e");

		System.out.println(ts);
		
		Set<Person> s4 = new LinkedHashSet<Person>();
		
		s4.add(new Person(101,22));
		s4.add(new Person(99,22));
		s4.add(new Person(89,12));
		
		System.out.println(s4);
		
	}

}
