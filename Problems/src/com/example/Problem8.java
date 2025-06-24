package com.example;

public class Problem8 {
	//max water in a container hight given in an array .
	//Brute force Approach 
	public int maxWaterInContainer(int[] arr,int n) {
		int maxWater=0;
		   for(int i=0;i<n;i++) {
			   for(int j=i+1;j<n;j++) {
				   int width=j-i;
				   int hight=Math.min(arr[i], arr[j]);
				   maxWater=Math.max(maxWater, hight*width);
			   }
		   }
		return maxWater;
	}
	
	//Optimal Approach
	
	public int maxWaterInContainerOptimal(int[] arr,int n) {
		int maxWater=0;
		int start=0;int end=n-1;
		while(end>start) {
			int width=end-start;
			int hight=Math.min(arr[start], arr[end]);
			int currentArea=width*hight;
			maxWater=Math.max(maxWater, currentArea);
			if(arr[end]>arr[start]) {start++;}else{end--;};
		}
		return maxWater;
	}
}
