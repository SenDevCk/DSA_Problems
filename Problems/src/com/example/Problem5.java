package com.example;

import java.util.Vector;

public class Problem5 {
	//Target Sum or Pair Sum
	
	
	public Vector<Integer> targetSumBrutForceApproch(int[] arr,int targetSum) {
		Vector<Integer> positions=new Vector<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==targetSum) {
					positions.add(i);
					positions.add(j);
					break;
				}
			}
		}
		return positions;
	}
	
	//two pointers approach , if the array is shorted .
	public Vector<Integer> targetSumEnhanced(int[] arr,int targetSum) {
		Vector<Integer> positions=new Vector<>();
		int start=0;
		int end=arr.length-1;
		do {
			if(arr[start]+arr[end]>targetSum) {
				end--;
			}else if(arr[start]+arr[end]<targetSum) {
				start++;
			}else {
				positions.add(start);
				positions.add(end);
				return positions;
			}
		}while(start<end);
		return positions;
	}
}
