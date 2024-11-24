package com.recursion.questions.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 3, -2 };
//		sort(arr);
//		sort2(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int currIndex = i;
			while (currIndex > 0 && arr[currIndex] < arr[currIndex - 1]) {
				int temp = arr[currIndex - 1];
				arr[currIndex - 1] = arr[currIndex];
				arr[currIndex] = temp;
				currIndex--;
			}
		}

	}

	public static void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;

			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public static void sortRec(int[] arr, int i, int j, int temp) {
		if (i == arr.length - 1) {
			return;
		}

	}

	public static void sort2(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
	}
}
