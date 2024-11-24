package com.recursion.questions;

// leet code -> https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(3));
	}

	public static boolean isPowerOfTwo(int num) {
		return helper(num, 0);
	}

	public static boolean helper(int num, int expo) {
		int power = (int) Math.pow(2, expo);

		if (power > num) {
			return false;
		} else if (power == num) {
			return true;
		} else {
			return helper(num, expo + 1);
		}
	}
}
