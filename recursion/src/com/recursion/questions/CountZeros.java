package com.recursion.questions;

public class CountZeros {
	public static void main(String[] args) {
		System.out.println(count(10000, 0));
	}

	public static int count(int num, int count) {
		if (num == 0) {
			return count;
		}
		int rem = num % 10;
		if (rem == 0) {
			return count(num / 10, count + 1);
		} else {
			return count(num / 10, count);
		}
	}
}
