package com.example;

import java.util.Arrays;

//Problem Binary Search Algorithm ,the binary search array must be shorted then it work .

public class Problem10 {
	
	public int binarySearchOptimization(int[] arr,int target,int n) {
		int start=0;
		int end=n-1;
		int mid=n/2;
		Arrays.sort(arr);
		System.out.println("Given Array--> with target "+target+" **");
		Arrays.stream(arr).forEach(item->System.out.print(" "+item));
		while(start<=end) {
			//mid=(start+end)/2;
			//optimization for infinite value
			mid= (start+(end-start)/2);
			if(arr[mid]>target) {
				start=mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]==target){
				return mid;
			}
		}
		return -1;
	}	

}
