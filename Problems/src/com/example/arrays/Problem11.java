package com.example.arrays;

//search rotated array
public class Problem11 {

	public int searchInRotatedArray(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (end >= start) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (arr[start] <= arr[mid]) {
				// left sorted
				if (arr[start] <= target && target <= arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else {
				// right sorted
				if (arr[mid] <= target && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return -1;
	}
}
