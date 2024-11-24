package com.recursion.questions.sorting;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {
		int arr[] = { 0, 34, 567, 23, 78, 24, 666, 78, 9, 56, 78 };
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void radixSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(arr, exp);
		}
	}

	private static void countSort(int[] arr, int exp) {
		int n = arr.length;
		int[] countArr = new int[10];
		int[] outputArr = new int[n];
		// count the occurrences of digits
		for (int i = 0; i < n; i++) {
			countArr[(arr[i] / exp) % 10]++;
		}

		// sort the counter values
		for (int i = 1; i < countArr.length; i++) {
			countArr[i] += countArr[i - 1];
		}

		// placing the element at right position in output Array based on there last
		// digit value
		for (int i = n - 1; i >= 0; i--) {
			outputArr[countArr[(arr[i] / exp) % 10] - 1] = arr[i];
			// decrementing the count value at the position so even if we have multiple
			// elements with same last digit value value wont get override
			countArr[(arr[i] / exp) % 10]--;
		}

		// copies all the output array elements to input array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = outputArr[i];
		}

	}
}
