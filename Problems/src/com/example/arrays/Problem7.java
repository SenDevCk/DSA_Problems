package com.example.arrays;

import java.util.ArrayList;

public class Problem7 {
	// create program for Power (x,n)

	public int power(int x, int n) {
		int result = 1;
		long binaryForm = n;
		if(x==1) return result;
		if(n==0) return result;
		if(x==-1 && n%2==0) return result;
		if(x==-1 && n%2!=0) return -result;
		if (n < 0) {
			x = 1 / x;
			binaryForm = -n;
		}
		while (binaryForm > 0) {
			if (binaryForm % 2 == 1) {
				result*= x;
			}
			x*= x;
			binaryForm /= 2;
		}
		return result;
	}
	
	//stock best buy sell and find the max profit program
	
	public int bestStockBuyAndShell(int[] arr,int n){
		int bestBuy=arr[0];
		int maxProfit=0;
		for(int i=1;i<n;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]>bestBuy) {
				maxProfit=Math.max(maxProfit, arr[i]-bestBuy);
			}
			bestBuy=Math.min(bestBuy, arr[i]);
		}
		return maxProfit;
	}
	
	
}
