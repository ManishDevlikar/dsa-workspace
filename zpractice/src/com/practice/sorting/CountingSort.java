package com.practice.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class CountingSort {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 1, 5, 4, 4, 3, 1, 67, 10 };
		countSort(arr);
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
//			System.out.println(i + " " + count);
			for (int j = 0; j < count; j++) {
				arr[index] = i;
				index++;
			}
		}

	}
}
