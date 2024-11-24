package com.recursion.questions.array;

public class SortedOrNot {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 9, 190 };
		boolean res = isSorted(arr);
		System.out.println(res);
		System.out.println(isSort(arr, 0));
	}

	public static boolean isSorted(int[] arr) {
		return helper(arr, 0);
	}

	public static boolean helper(int[] arr, int start) {
		if (start == arr.length - 1) {
			return true;
		}
		if (arr[start] < arr[start + 1]) {
			return helper(arr, start + 1);
		} else {
			return false;
		}

	}

	public static boolean isSort(int arr[], int start) {
		if (start == arr.length - 1) {
			return true;
		}
		return arr[start] < arr[start + 1] && isSort(arr, start + 1);
	}

}
