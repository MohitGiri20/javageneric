package com.telstra.main;

import java.util.Arrays;
import java.util.Scanner;

import com.telstra.BinarySearch;


public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.out.println("Enter the size of the array");
        
        int n = scn.nextInt();
        
        if(n <= 0) { 
        	System.out.println("Please enter valid size for array"); 
        	return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        
        for(int i=0;i<n;i++){
            System.out.print("Enter element " + i +": ");
            arr[i] = scn.nextInt();
            
        }
        
        System.out.println("For searching an element in array using binary search the array must be sorted");
        
        System.out.println("Sorted array is:");
        Arrays.sort(arr);
        
        for(int e : arr) 
        {
            System.out.print(e + " ");
        }

        System.out.println();
        
        int start = 0;
        int end = n-1;
        
       
        while(true) {
        	
        	 System.out.println("Enter appropriate choice");
             System.out.println("1. Search for an element in same array");
             System.out.println("2. Exit");
             
             int choice = scn.nextInt();
             
        
        switch(choice) {
        
        case 1: {
        
            System.out.println("Enter the element to be searched:");        
            int ele = scn.nextInt();
            
            int idx = BinarySearch.recursion_bs(arr, start, end, ele);
            int idx_it = BinarySearch.iterative_bs(arr, start, end, ele); 
            int idx_in = Arrays.binarySearch(arr,ele);
                                    
            System.out.println("Using Recursive Binary Search =>" + (idx == -1 ? "Element not found" : ("Element found at index " + idx)));
            System.out.println("Using Iterative Binary Search =>" + (idx_it == -1 ? "Element not found" : ("Element found at index " + idx_it)));
            System.out.println("Using Inbuilt Binary Search =>"+ (idx_in < 0 ? "Element not found" : ("Element found at index " + idx_in)));
            System.out.println(idx_in);
            
            // If array contains duplicate elements then binary search algorithm will 
            // give the index of the first same element it encountered. It may not be
            // the first and last occurrence of the element i.e. searched.
             
             BinarySearch.recursion_bs_firstOcc(arr, start, end, ele);
             int firstOccIdx  = BinarySearch.fIdx;
             
             BinarySearch.recursion_bs_lastOcc(arr, start, end, ele);
             int lastOccIdx =  BinarySearch.lIdx;
             
             System.out.println("For array containing duplicate elements");
             
             System.out.println("First Occurrence of " + ele + " at index: " + firstOccIdx +", " + "Last Occurrence of " + ele + " at index: "  + lastOccIdx);
             
             BinarySearch.fIdx = -1;
             BinarySearch.lIdx = -1;
        	break;
        }
        default:
        	System.out.println("Exit");
        	 System.exit(0);
        }
        
        }
	}

}
