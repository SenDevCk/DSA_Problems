package com.example;

import java.util.Arrays;
import java.util.Vector;

public class Problem6 {

	// Mejority elements from an array (equals to n/2)

	public Vector<Integer> brutForceApproch(int[] arr, int arrLength) {
		int frequency = 0, mejorityElement = arr[0];
		Vector<Integer> vector = new Vector<>();
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (arr[i] == arr[j]) {
					frequency += 1;
				}
			}
			if (frequency == arrLength / 2) {
				mejorityElement = arr[i];
				vector.add(mejorityElement);
				vector.add(frequency);
				return vector;
			}
			frequency = 0;
		}
		if (vector.size() <= 0) {
			vector.add(-1);
		}
		return vector;
	}

	public Vector<Integer> brutForceApproch2(int[] arr, int arrLength) {
		int newSum = 0, oldSum = 0, mejorityElement = arr[0];
		Vector<Integer> vector = new Vector<>();
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (arr[i] == arr[j]) {
					newSum += 1;
				} else {
					newSum = 0;
				}
				if (newSum > oldSum) {
					oldSum = newSum;
					mejorityElement = arr[i];
					vector.add(mejorityElement);
					vector.add(oldSum);
				}
			}
		}
		return vector;
	}

	public Vector<Integer> enhanceApproch(int[] arr, int n) {
		Vector<Integer> vector = new Vector<>();
		Arrays.sort(arr);
		int frequency = 1;
		int data = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				frequency++;
			} else {
				frequency = 1;
				data = arr[i];
			}
		}
		if (frequency > 1) {
			vector.add(data);
			vector.add(frequency);
		}
		return vector;
	}

}
