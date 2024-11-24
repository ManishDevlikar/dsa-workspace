package com.recursion.questions.array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 67, 89, 90 };
		int ans = binarySearch(arr, 0, arr.length - 1, 12);
		System.out.println(ans);
	}

	public static int binarySearch(int[] arr, int start, int end, int target) {

		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;

		if (arr[mid] == target) {
			return mid;
		} else if (target > arr[mid]) {
			return binarySearch(arr, mid + 1, end, target);
		} else {
			return binarySearch(arr, start, mid - 1, target);
		}
	}
}
