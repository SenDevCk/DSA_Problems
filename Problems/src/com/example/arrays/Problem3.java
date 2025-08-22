package com.example.arrays;

public class Problem3 {
  //reversing an array
	public void reverseArray(int[] givenArray) {
		System.out.print("Given Array :-> ");
		for(int data:givenArray) {
			System.out.print(data+" ");
		}
		int midPoint=givenArray.length/2;
		int start=0;
		int end=givenArray.length-1;
		do {
			int temp=givenArray[start];
			givenArray[start]=givenArray[end];
			givenArray[end]=temp;
			start++;
	        end--;
		}while(start<end);
		System.out.print("\nOutput Array :-> ");
		for(int data:givenArray) {
			System.out.print(data+" ");
		}
	}
	
	//find 2nd largest of an array
}
