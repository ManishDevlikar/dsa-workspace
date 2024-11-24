package com.recursion.questions.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class CountingSort {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 1, 5, 4, 4, 3, 1, 67, 10 };
		countSort2(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void countSort(int arr[]) {
		if (arr == null)
			return;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int index = 0;

		for (int i = min; i <= max; i++) {
			int count = map.getOrDefault(i, 0);
			System.out.println(i + " " + count);
			for (int j = 0; j < count; j++) {
				arr[index] = i;
				index++;
			}
		}

	}

	public static void countSort2(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int counts[] = new int[max + 1];
		// increment the initial count for elements
		for (int ele : arr) {
			counts[ele]++;
		}

		int startingIndex = 0;
		for (int i = 0; i <= max; i++) {
			int count = counts[i];
			counts[i] = startingIndex;
			startingIndex += count;
		}
		int sortedArr[] = new int[arr.length];
		for (int ele : arr) {
			sortedArr[counts[ele]] = ele;
			counts[ele]++;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sortedArr[i];
		}
	}
}
