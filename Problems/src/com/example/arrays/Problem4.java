package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
  //sub array [1,2,3,4,5,6]
	
	public void subArray(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=i;j<=arr.length;j++) {
				for(int k=i;k<j;k++) {
					System.out.print(arr[k]);
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public long maxSubarraySum(int[] arr,int length) {
		long current_sum=0,final_sum=Integer.MIN_VALUE;
		for(int start=0;start<=length;start++) {
			for(int end=start;end<=length;end++) {
				for(int work=start;work<end;work++) {
					current_sum+=arr[work];
				}
				if(current_sum>final_sum) {
					final_sum=current_sum;
				}
				current_sum=0;
			}
		}
		return final_sum;
	}
	
	public long kedanesAlgoSubarraySum(int[] arr,int length) {
		long current_sum=0,final_sum=Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			current_sum+=arr[i];
			if(current_sum>final_sum) {
			 final_sum=current_sum;
			}
				if(current_sum<0)current_sum=0;
		}
		return final_sum;
	}
	
	
	 
	 
	 
}
