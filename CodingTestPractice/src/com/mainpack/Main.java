package com.mainpack;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> arrL = Arrays.asList(1,2,3,4,10,5,5,6);
		
//		int findmaxSum = maxSum(arrL);
//         
//		int n = scn.nextInt();
//		
//		if(n<0) {
//			System.out.println("Invalid size");
//			return;
//		}
//		
//		int [] arr = new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			int ele = scn.nextInt();
//			if(ele < 0) {
//				System.out.println("Invalid integer");
//				return;
//			}
//			arr[i] = ele;
//		}
//		
//		int findmSum = maxSumArray(arr);
//		
//		
//		System.out.println("1: " + findmaxSum);
//		System.out.println("2: " + findmSum);
		
//	System.out.println("Power of 2");
//	 System.out.println(powerUsingRecursion(100));
//	 System.out.println(powerOfTwo(100000));
//	 System.out.println(powerOfTwoI(100));
		
		
		
	// Count Strings containing space
		
		List<String> sl = new ArrayList<String>();
		sl.add("abc");
		sl.add(" ");
		sl.add("def");
		sl.add(" ");
		sl.add(" ");
		sl.add("xyz");
		
		int count = 0;
		
		for(String s : sl) {
			
			if(s == " ") count++;
		}
		System.out.println(count);
		
		 count  = (int) sl.stream().filter(s -> s.equals(" ")).count();
	 System.out.println(count);
	 
	 // Count of Strings of length 3
	 
       int countL = 0;
       
       for(String s : sl) {
    	   if(s.length() == 3) countL++;
       }
       
       System.out.println(countL);
       
       // Using Java8 stream
       
       countL = (int) sl.stream().filter(s -> (s.length() == 3)).count();
       
       System.out.println(countL);
       
       // Eliminate String containing
       
       List<String> ans = new ArrayList<String>();
             for(String s : sl) {
    	   if(!s.equals(" ")) ans.add(s);
       }
       
       System.out.println(ans);
       
       // Using Java8 stream
       
       List<String> l = sl.stream().filter(s -> !s.equals(" ")).collect(Collectors.toList());
       System.out.println(l);
       
       // Eliminate empty string and join using comma
       
       String mergedString = "";
       
       for(int  i=0;i<sl.size();i++) {
    	   
    	   if(!sl.get(i).equals(" ")) mergedString += sl.get(i) + ",";
       }
      
       System.out.println(mergedString.substring(0, mergedString.length()-1));
       
       // Using Java8
       
       mergedString = sl.stream().filter(s -> !s.equals(" ")).collect(Collectors.joining(","));
       System.out.println(mergedString);
       
//       int[] arr = new int[] {1,2,4};
//       List<int[]> a = Arrays.asList(arr);
    
       // Square of numbers
       List<Integer> l2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
       
       Iterator<Integer> it = l2.iterator();
       
       while(it.hasNext()) {
    	   int i = it.next();
    	   System.out.println(i*i);
       }
       
       // Using Java8
       
       List<Integer> sqNums = l2.stream().map(i -> i*i).collect(Collectors.toList());
       System.out.println(sqNums);
       
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       int sum = 0;
       int avg = 0;
       
       Iterator<Integer> it1 = l2.iterator();
       
       while(it1.hasNext()){
    	   
    	   int i = it1.next();
    	   if(i > max) max = i;
    	   if(i<min) min = i;
    	   sum+=i;
       }
       
       System.out.println("Max Value: " + max + " Min Value: " + min + " Sum: " + sum + " Average :" 
       + ((float)sum/l2.size()));
       
       // Using Java8
       
       DoubleSummaryStatistics stats = l2.stream().mapToDouble(i -> i).summaryStatistics();
       System.out.println("Max Value: " + stats.getMax() + " Min Value: " + stats.getMin() + " Sum: " + stats.getSum() + " Average :" 
    	       + stats.getAverage());
       
	 // Count Strings containing space using parallel processing
       
        count = (int) sl.parallelStream().filter(s -> s.equals(" ")).count();
        
        System.out.println(count);
        
	 }
	
	public static int maxSum(List<Integer> arr){
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i=0;i<arr.size();i++) {
			if(i % 2 != 0) oddSum += arr.get(i);
			else evenSum += arr.get(i); 
		}
		
		return Math.max(oddSum, evenSum);
	}

     public static int maxSumArray(int[] arr){
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 != 0) oddSum += arr[i];
			else evenSum += arr[i]; 
		}
		
		return Math.max(oddSum, evenSum);
	}
     
     public static double powerUsingRecursion(int p) {
    	 
    	 if(p==0) return 1;
    	 
    	 double ans1 = powerUsingRecursion(p>>1);
    	 
    	 if(p % 2 == 0) return ans1*ans1;
    	 
    	 return ans1 *ans1 *2;
     }
     
     public static double powerOfTwoI(int p){
    	 
    	 double ans = 1;
    	 for(int i=1;i<=p;i++){
    		 ans *= 2;
    	 }
    	 return ans;
    	 
     }
     
     
     
     public static long powerOfTwo(int p) {
    	 
    	 return  (long) Math.pow(2, p);
     }
     
}
