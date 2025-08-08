package com.example;


/*
 * Problem Mountain Array find the peak element
 */
public class Problem12 {
    
	public int peakElement(int[] arr,int length) {
		int start=0;
		int end=length-1;
		   while(end>=start) {
			   int mid=start+(end-start)/2;
			   if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
				  return mid;				   
			   }
			   else if(arr[mid]>arr[mid-1]) {
				   start=mid+1;
			   }else {
				   end=mid-1;
			   }
		   }
		return -1;
	}
}
