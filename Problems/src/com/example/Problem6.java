package com.example;

public class Problem6 {
//Mejority Elements from an array
	
	public int brutForceApproch(int[] arr,int arrLength) {
		int newSum=0,oldSum=0,mejorityElement=arr[0];
		for(int i=0;i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arr[i]==arr[j]) {
					newSum+=1;
				}else {
					newSum=0;
				}
				if(newSum>oldSum) {
					oldSum=newSum;
					mejorityElement=arr[i];
				}
			}
		}
		return mejorityElement;
	}
	
	
}
