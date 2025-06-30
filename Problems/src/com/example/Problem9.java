package com.example;
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem9 {
     //Product of an array except self 
	
	   //Brute force approach 
	
	 public ArrayList<Integer> productOfArray(int[] arr,int n){
		 ArrayList<Integer> result=new ArrayList<>();
		 for(int i=0;i<n;i++) {
			 int product=1;
			 for(int j=0;j<n;j++) {
				 if(i!=j) {
					 product*=arr[j];
				 }
			 }
			 result.add(product);
			 product=1;
		 }
		 return result;
	 }
	 
	 //Optimal Approach
	 public List<Integer> productOfArrayWithOptimalApproach(int[] arr,int n){
		 List<Integer> result=new ArrayList<>();
		 int[] prifix=new int[n];
		 int[] suffix=new int[n];
		 prifix[0]=1;
		 for(int i=1;i<n;i++) {
			 prifix[i]=(arr[i-1]*prifix[i-1]);
		 }
		 suffix[n-1]=1;
		 for(int j=n-2;j>=0;j--) {
			 suffix[j]=arr[j+1]*suffix[j+1];
		 }
		 for(int i=0;i<n;i++) {
			 result.add(prifix[i]*suffix[i]);
		 }
		 Arrays.stream(prifix).forEach(i -> System.out.print(i + " "));
		 System.out.println("\n");
		 Arrays.stream(suffix).forEach(i -> System.out.print(i + " "));
		 System.out.println("\n");
		 return result;
	 }
}
