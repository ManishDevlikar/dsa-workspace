package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 4, 2, 3, 0 };
		doSelectionSort(arr);
	}

	public static void doSelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minValueIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
