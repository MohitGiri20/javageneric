package com.telstra;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Stack is the child of the vector and not arraylist
		
		Stack<String> st = new Stack<String>();
		
		st.push("mg");
		st.push("mohit");
		st.push("max");
		st.push("min");
		
		System.out.println(st);
		
		System.out.println(st.peek()); // gives topmost element
		
		while(st.size()>0) {
			
			System.out.println(st.peek());
			st.pop();
		}
		
		st.add("Mi");
		st.add(0, "mm");
		System.out.println(st.peek());
		st.remove("mm");
		System.out.println(st.size());
		
		System.out.println(st.search("Mohit"));

	}

}
