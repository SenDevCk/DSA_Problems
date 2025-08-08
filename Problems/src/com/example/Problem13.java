package com.example;

/*
 * Single Element in Shorted Array
 */
public class Problem13 {
   
	public int singleElement(int[] arr) {
		int start=0;int end=arr.length-1;int mid=0;
		while (end>=start) {
			mid=start+(end-start)/2;
			if(mid==0 && arr[mid]!=arr[mid+1]) return mid;
			if(mid==arr.length-1 && arr[mid]!=arr[mid-1]) return mid;
			if(mid%2==0) {
				if(arr[mid-1]==arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				if(arr[mid-1]==arr[mid]) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
		}
		return -1;
	}
}
