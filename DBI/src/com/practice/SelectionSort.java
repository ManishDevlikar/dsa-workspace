package com.practice;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 1, 5 };
		selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
