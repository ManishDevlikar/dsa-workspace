package com.dsa.stack.interviewqna;

import java.util.Arrays;

public class GameOfTwoStack {

	public static int twoStack(int maxSum, int[] a, int[] b, int sum, int count) {
		if (sum > maxSum) {
			return count - 1;
		}

		if (a.length == 0 || b.length == 0) {
			return count - 1;
		}

		int res1 = twoStack(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
		int res2 = twoStack(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

		return Math.max(res1, res2);
	}

	public static void main(String[] args) {
		int maxSum = 10;
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9 };
		int sum = 0;
		int count = 0;

		int res = twoStack(maxSum, a, b, sum, count);
		System.out.println(res);
	}
}
