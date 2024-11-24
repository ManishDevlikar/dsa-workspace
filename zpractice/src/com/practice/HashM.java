package com.practice;

public class HashM {
	public static void main(String[] args) {
//		HashMap<Integer, Integer> hmap = new HashMap<>();
//		LinkedHashMap<Integer, Integer> lmap = (LinkedHashMap<Integer, Integer>) hmap;
		int arr[] = { 1, 3, 4, 2, 1 };
		int mid = arr.length / 2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[arr.length - mid];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[mid + i];
		}

		for (int i : arr1) {
			System.out.println(i);
		}
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
