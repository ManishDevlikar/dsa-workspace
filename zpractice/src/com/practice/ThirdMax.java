package com.practice;

import java.util.Arrays;

public class ThirdMax {

	public static int thirdMax(int[] nums) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		firstMax = sorted[sorted.length - 1];
		secondMax = sorted[sorted.length - 2];
		if (sorted.length > 2) {
			thirdMax = sorted[sorted.length - 3];
		}
		return (thirdMax >= Integer.MIN_VALUE && nums.length > 2) ? thirdMax : firstMax;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3 };
		System.out.println(thirdMax(arr));
	}
}
