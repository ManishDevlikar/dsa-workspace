package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BogoSort {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(2, 5, 8, 9, 23, 67, 12, 10, 23, 54, 78, 1);
		numberList.add(1000);
		worstSort(numberList);

		System.out.println(numberList);

	}

	public static void worstSort(List<Integer> numberList) {

		while (!isListSorted(numberList)) {
			Collections.shuffle(numberList);
		}

		numberList.forEach(i -> System.out.println(i));
	}

	private static boolean isListSorted(List<Integer> numberList) {
		if (numberList == null) {
			return true;
		}

		int length = numberList.size();
		if (length <= 1) {
			return true;
		}

		for (int i = 0; i < length - 1; i++) {
			if (numberList.get(i) > numberList.get(i + 1)) {
				return false;
			}
		}

		return true;
	}

}
