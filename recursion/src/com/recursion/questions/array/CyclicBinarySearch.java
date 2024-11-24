package com.recursion.questions.array;

public class CyclicBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 1, 2, 3, 4 };
		int res = search(arr, 4, 0, arr.length - 1);
		System.out.println(res);

	}

	public static int search(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {
			return mid;
		}

		if (arr[start] <= arr[mid]) {
			if (target <= arr[mid] && target >= arr[start]) {
				return search(arr, target, start, mid - 1);
			} else {
				return search(arr, target, mid + 1, end);
			}
		}

		if (target >= arr[mid] && target <= arr[end]) {
			return search(arr, target, mid + 1, end);
		}
		return search(arr, target, start, mid - 1);
	}
}
