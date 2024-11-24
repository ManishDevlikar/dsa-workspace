package com.practice.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 1, 23, 56, 43, 12, 14 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[], int lowIndex, int highIndex) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		if (leftPointer >= rightPointer) {
			return;
		}

		int pivit = arr[highIndex];
		while (leftPointer < rightPointer) {

			while (leftPointer < rightPointer && arr[leftPointer] <= pivit) {
				leftPointer++;
			}
			while (leftPointer < rightPointer && arr[rightPointer] >= pivit) {
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);
		sort(arr, lowIndex, leftPointer - 1);
		sort(arr, leftPointer + 1, highIndex);
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
