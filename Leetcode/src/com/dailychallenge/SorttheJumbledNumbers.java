package com.dailychallenge;

import java.util.Arrays;
import java.util.HashMap;

/*
 2191. Sort the Jumbled Numbers
Medium
Topics
Companies
Hint
You are given a 0-indexed integer array mapping which represents the mapping rule of a shuffled decimal system. mapping[i] = j means digit i should be mapped to digit j in this system.

The mapped value of an integer is the new integer obtained by replacing each occurrence of digit i in the integer with mapping[i] for all 0 <= i <= 9.

You are also given another integer array nums. Return the array nums sorted in non-decreasing order based on the mapped values of its elements.

Notes:

Elements with the same mapped values should appear in the same relative order as in the input.
The elements of nums should only be sorted based on their mapped values and not be replaced by them.
 

Example 1:

Input: mapping = [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
Output: [338,38,991]
Explanation: 
Map the number 991 as follows:
1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.
Therefore, the mapped value of 991 is 669.
338 maps to 007, or 7 after removing the leading zeros.
38 maps to 07, which is also 7 after removing leading zeros.
Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
Thus, the sorted array is [338,38,991].
 */

public class SorttheJumbledNumbers {
	public static void sort(int[] mapping, int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < mapping.length; i++) {
			map.put(i, mapping[i]);
		}

		int[] sums = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int num = 0;
			while (temp != 0) {
				num = num * 10 + map.get(temp % 10);
				temp /= 10;
			}
			int rev = 0;
			while (num != 0) {
				rev = rev * 10 + num % 10;
				num /= 10;
			}

			sums[i] = rev;
		}

		int resArr[] = sortBasedOnAnotherArray(sums, nums);
		System.out.println(Arrays.toString(resArr));
	}

	public static int[] sortBasedOnAnotherArray(int[] base, int[] toSort) {
		int[][] pairs = new int[base.length][2];

		for (int i = 0; i < base.length; i++) {
			pairs[i][0] = base[i];
			pairs[i][1] = toSort[i];
		}

//		Arrays.sort(pairs, (a, b) -> {
//			return Integer.compare(a[0], b[0]);
//		});
		Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

		int[] resultArr = new int[base.length];
		for (int i = 0; i < base.length; i++) {
			resultArr[i] = pairs[i][1];
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] mapping = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		sort(mapping, nums);
	}
}
