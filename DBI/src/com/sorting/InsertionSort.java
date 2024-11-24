package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 4, 3, 2, 0 };
		doInsertionSort(arr);
	}

	public static void doInsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int max = arr[i];

			while (j > 0 && arr[j - 1] > max) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = max;
		}
		System.out.println(Arrays.toString(arr));
	}
}
