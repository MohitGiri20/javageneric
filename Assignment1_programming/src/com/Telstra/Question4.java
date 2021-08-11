package com.Telstra;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question4 {

	
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. To remove all the duplicate  elements in an integer array
		
		System.out.println("Enter the size of the array:");
		
		int size = scn.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i < size; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		//removeDuplicates(arr);
		
		removeDuplicatesMap(arr);
		removeDuplicatesSet(arr);
		
	}
	
	public static void removeDuplicates(int[] arr) {
		
        Arrays.sort(arr);
		
		
		int i=0,j=1;
		
		while(j < arr.length) {
			
		    if(arr[i]!=arr[j]) {
		    	i++;
		    	arr[i] =arr[j];
		    	j++;
		    }else {
		    	
		    	j++;
		    }
		}
		
		System.out.println("Array elements after removing duplicate elements are");
		
		for(int itr =0;itr<=i;itr++) {
			System.out.print(arr[itr] + " ");
		}
		
		System.out.println();
		
	}
	
	public static void removeDuplicatesMap(int[] arr) {
		
		Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1); 
			}else {
				 map.put(arr[i],map.get(arr[i])+1);
			}
			
			
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) System.out.println(entry.getKey());
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// Method 2 of iteration
		System.out.println("------------------------------------------------");
		for(Integer key : map.keySet()) {
			 if(map.get(key) ==  1) System.out.println(key); 
		}
		
		
	}
	
	public static void removeDuplicatesSet(int[] arr) {
		
		
		System.out.println("------------------------------------------------");
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int ele : arr) {
			set.add(ele);
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------------------------");
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		for(int ele : arr) {
			s1.add(ele);
		}
		
		Iterator<Integer> it1 = s1.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
	

}
