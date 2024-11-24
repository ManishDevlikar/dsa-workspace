package com.recursion.questions;

public class SumOfDigits {
	public static void main(String[] args) {
		int res = sum(1234);
		System.out.println(res);
	}

	public static int sum(int num) {
		if (num <= 1) {
			return num;
		}
		return num % 10 + sum(num / 10);
	}
}
