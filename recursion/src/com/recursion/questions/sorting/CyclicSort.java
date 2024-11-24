package com.recursion.questions.sorting;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
	}

	public static void cyclicSortWithZero(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
	}
}
