package com.example.arrays;
/*
 * Book Allocation among students equally
 */
public class Problem15 {

	
	public int equalBookAllocationAmongChildrens(int arr[],int m) {
		int result=-1;int sum=0;
		if(arr.length<m) return result;
		for(int item:arr) {
			sum+=item;
		}
		int start=0;int end=sum;
		while (end>=start) {
			int mid=start+(end-start)/2;
			if(isValid(arr,arr.length,m,mid)) {
				//left
				result=mid;
				end=mid-1;
			}else {
				//right
				start=mid+1;
			}
		}
		return result;
	}

	private boolean isValid(int[] arr, int n, int m, int mid) {
		// TODO Auto-generated method stub
		int st=1,pages=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>mid) {
				return false;
			}
			if(pages+arr[i]<=mid) {
				pages+=arr[i];
			}else {
				st++;
				pages=arr[i];
			}
		}
		return (st>mid)?false:true;
	}
}
