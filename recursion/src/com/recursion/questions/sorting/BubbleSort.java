package com.recursion.questions.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 4, 2 };
		sort(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr, int row, int col) {
		if (row == 0) {
			return;
		}
		if (row > col) {
			if (arr[col] > arr[col + 1]) {
				int temp = arr[col];
				arr[col] = arr[col + 1];
				arr[col + 1] = temp;
			}
			sort(arr, row, col + 1);
		} else {
			sort(arr, row - 1, 0);
		}
	}
}
