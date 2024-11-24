package com.practice.sorting;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66, 0 };
		radixSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void radixSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countingSort(arr, exp);
		}
	}

	private static void countingSort(int[] arr, int exp) {
		int n = arr.length;
		int[] countArr = new int[10];
		int[] outputArr = new int[n];

		for (int i = 0; i < n; i++) {
			// for 441 -> at 1st iteration -> 1 | at 2nd iteration -> 4
			// | at 3rd iteration -> 4
			countArr[(arr[i] / exp) % 10]++;
		}
		System.out.println("Counter Array ->" + Arrays.toString(countArr));

		// now it will hold the actual position in counter array
		for (int i = 1; i < 10; i++) {
			countArr[i] += countArr[i - 1];
		}
		System.out.println("Counter Array after position updation->" + Arrays.toString(countArr));

		// building output arr
		for (int i = n - 1; i >= 0; i--) {
			outputArr[countArr[(arr[i] / exp) % 10] - 1] = arr[i];
			countArr[(arr[i] / exp) % 10]--;
		}
		System.out.println("Counter Array after updating ouput Array->" + Arrays.toString(countArr));
		System.out.println("output Array ->" + Arrays.toString(outputArr));

		for (int i = 0; i < n; i++) {
			arr[i] = outputArr[i];
		}

	}
}
