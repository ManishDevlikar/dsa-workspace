package com.practice;

import java.util.Arrays;

public class SqaureAndSorted {
	public static void main(String[] args) {
		int[] res = sortedSquares(new int[] { -2, 3, 2, 5, 10 });
		for (int i : res) {
			System.out.println(i);
		}
	}

	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}
