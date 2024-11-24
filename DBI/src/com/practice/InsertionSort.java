package com.practice;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 2, 1 };
		insertionSort(arr);
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i;

			while (index > 0 && arr[index - 1] > temp) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
