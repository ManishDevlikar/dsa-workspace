package com.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 4, 6, 8, 7, 9 };
		mergeSort(arr);
		System.out.println("Result" + Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr) {
		int arrLength = arr.length;

		if (arrLength < 2) {
			return;
		}

		int midIndex = arrLength / 2;
		int[] leftArr = new int[midIndex];
		int[] rightArr = new int[arrLength - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftArr[i] = arr[i];
		}

		for (int i = midIndex; i < arrLength; i++) {
			rightArr[i - midIndex] = arr[i];
		}

		mergeSort(leftArr);
		mergeSort(rightArr);
		// to merge this two sored array
		merge(arr, leftArr, rightArr);
	}

	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int leftLength = leftArr.length;
		int rightLength = rightArr.length;

		int i = 0, j = 0, k = 0;

		System.out.println("Before" + Arrays.toString(arr));
		System.out.println("leftArr" + Arrays.toString(leftArr));
		System.out.println("rightArr" + Arrays.toString(rightArr));

		while (leftLength > i && rightLength > j) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < leftLength) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < rightLength) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
