package com.example;

public class Problem1 {
	//simple swaping problem
	public void swap(int a,int b) {
		System.out.println("a= "+a+" b= "+b);
		int temp=b;
		b=a;
		a=temp;
		System.out.println("a= "+a+" b= "+b);
	}

}
