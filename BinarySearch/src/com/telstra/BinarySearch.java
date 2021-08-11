package com.telstra;

public class BinarySearch {
	 
	 public static int recursion_bs(int[] arr,int start,int end,int ele){
	        
	        if(start > end) {
	            return -1;
	        }
	        
	        int mid = (start) +  ( (end - start) >> 1 );

	        if(arr[mid] == ele) {
	        	return mid;
	        }
	        
	        else if(arr[mid] > ele) {
	        	return recursion_bs(arr,start,mid-1,ele);
	        }
	        else {
	        	return recursion_bs(arr, mid + 1, end, ele);
	        }
	         
	        

	    }
	 
	 public static int iterative_bs(int[] arr,int start,int end,int ele){

	        while(start<=end){
	           
	            int mid = (start) +  ( (end - start) >> 1 );

	            if(arr[mid] == ele) {
	            	return mid;
	            }

	            if(arr[mid] > ele) {
	            	end = mid - 1;
	            }

	            else {
	            	start = mid + 1;
	            }

	        }

	        return -1;
	    }
	 
	 
	 // For duplicate elements
	 
	 // Finding the first occurrence of duplicate element
	 
 public static int fIdx=-1;
	 
	 public static void recursion_bs_firstOcc(int[] arr,int start,int end,int ele) {
		 
		  if(start > end) {
	            return ;
	        }
	        

	        int mid = (start) +  ( (end - start) >> 1 );
	        

	        if(arr[mid] == ele) {
	        	fIdx = mid;
	        	recursion_bs_firstOcc(arr,start,(mid-1),ele);
	        }
	        
	        else if(arr[mid] > ele) {
	        	recursion_bs_firstOcc(arr,start,(mid-1),ele);
	        }
             
	        else {
	        	recursion_bs_firstOcc(arr, (mid + 1), end, ele);	
	        }
	         
		 
		 
	 }
	 
	
	 
	 public static int lIdx = -1;
	 
	 public static void recursion_bs_lastOcc(int[] arr,int start,int end,int ele) {
		 
		  if(start > end) {
	            return ;
	        }
	        
	       

	        int mid = (start) +  ( (end - start) >> 1 );

	        if(arr[mid] == ele) {
	        	lIdx = mid;
	           recursion_bs_lastOcc(arr,mid+1,end,ele);
	        }
	        
	        else if(arr[mid] > ele) {
	        	recursion_bs_lastOcc(arr,start,mid-1,ele);
	        }

	         
	        else {
	        	recursion_bs_lastOcc(arr, mid + 1, end, ele);
	        }
		 
		 
	 }
	 
	 

}
