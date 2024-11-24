package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSortOptimize {
	public static void main(String[] args) {
		int arr[] = { 4, 3, 1, 5, 2, 8, 6, 7, 10, 9 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivitIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivit = arr[pivitIndex];
		swap(arr, pivitIndex, highIndex);
		int leftPointer = partition(arr, lowIndex, highIndex, pivit);
		quickSort(arr, lowIndex, leftPointer - 1);
		quickSort(arr, leftPointer + 1, highIndex);
	}

	private static int partition(int[] arr, int lowIndex, int highIndex, int pivit) {
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
		return leftPointer;
	}

	public static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
