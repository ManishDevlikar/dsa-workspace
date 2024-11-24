package com.recursion.questions.array;

import java.util.ArrayList;

public class LenearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 4, 5, 5, 6, 7, 0 };
		boolean res = search(arr, 6, 0);
		System.out.println(res);
		////////////////////////////////////////
		int res2 = search2(arr, 6, 0);
		System.out.println(res2);
		//////////////////////////////////////////
		int res3 = findFromLast(arr, 6, arr.length - 1);
		System.out.println(res3);
		///////////////////////////////////////////
		System.out.println(findAllIndex(arr, 5));
		//////////////////////////////////////////
//		ArrayList<Integer> resList = new ArrayList<Integer>();
		System.out.println(findAllIndex2(arr, 5, 0, new ArrayList<>()));
		//////////////////////////////////////////
		ArrayList<Integer> back = findAllIndex3(arr, 5, 0);
		System.out.println(back);
	}

	public static boolean search(int arr[], int target, int start) {
		if (start > arr.length - 1) {
			return false;
		}
		return arr[start] == target || search(arr, target, start + 1);
	}

	public static int search2(int[] arr, int target, int start) {
		if (start > arr.length - 1) {
			return -1;
		}
		if (arr[start] == target) {
			return start;
		} else {
			return search2(arr, target, start + 1);
		}
	}

	public static int findFromLast(int arr[], int target, int end) {
		if (end < 0) {
			return -1;
		}
		if (arr[end] == target) {
			return end;
		} else {
			return findFromLast(arr, target, end - 1);
		}
	}

	public static ArrayList<Integer> findAllIndex(int[] arr, int target) {
		ArrayList<Integer> resList = new ArrayList<Integer>();
		return helper(arr, target, 0, resList);
//		System.out.println(resList);
	}

	public static ArrayList<Integer> helper(int[] arr, int target, int start, ArrayList<Integer> resList) {
		if (start == arr.length) {
			return resList;
		}
		if (arr[start] == target) {
			resList.add(start);
		}
		return helper(arr, target, start + 1, resList);
	}

	public static ArrayList<Integer> findAllIndex2(int arr[], int target, int start, ArrayList<Integer> resList) {
		if (start == arr.length) {
			return resList;
		}
		if (target == arr[start]) {
			resList.add(start);
		}
		return findAllIndex2(arr, target, start + 1, resList);
	}

	public static ArrayList<Integer> findAllIndex3(int arr[], int target, int start) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (start == arr.length) {
			return list;
		}
		if (arr[start] == target) {
			list.add(start);
		}
		ArrayList<Integer> backArray = findAllIndex3(arr, target, start + 1);
		list.addAll(backArray);
		return list;
	}
}
