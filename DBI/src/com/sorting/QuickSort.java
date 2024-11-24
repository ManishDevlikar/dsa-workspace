package com.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 20, 70, 80, 10, 40, 60, 50, 30, 90, 100 };
		queckSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void queckSort(int arr[], int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivit = arr[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivit && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivit && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);
		queckSort(arr, lowIndex, leftPointer - 1);
		queckSort(arr, leftPointer + 1, highIndex);
	}

	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
