package com.practice.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 68, 9, 8 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[]) {
		int length = arr.length;

		if (length < 2) {
			return;
		}

		int mid = length / 2;
		int left[] = new int[mid];
		int right[] = new int[length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		for (int i = mid; i < length; i++) {
			right[i - mid] = arr[i];
		}

		sort(left);
		sort(right);
		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			arr[k] = left[i++];

			k++;
		}
		while (j < rightLength) {
			arr[k] = right[j++];
			k++;
		}
	}
}
