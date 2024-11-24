package com.array;

import java.util.Arrays;

// remove element using index 
public class RemoveElement {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 2 };
//		System.out.println(Arrays.toString(removeElement(arr, 0)));
		System.out.println(Arrays.toString(removeElementByIndex(arr, 1)));

	}

	public static int[] removeElement(int[] arr, int index) {

		if (index <= arr.length && index > 0) {
			int[] result = new int[arr.length - 1];
			int k = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i + 1 == index) {
					continue;
				} else {
					result[k++] = arr[i];
				}
			}
			return result;
		}
		return arr;
	}

	public static int[] removeElementByIndex(int[] arr, int index) {
		if (index >= 0 && index <= arr.length) {
			for (int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = Integer.MIN_VALUE;
		}
		return arr;
	}
}
