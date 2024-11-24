package com.recursion.questions;

public class ProductOfDigits {
	public static void main(String[] args) {
		int ans = product(444);
		System.out.println(ans);
	}

	public static int product(int num) {
		if (num <= 1) {
			return 1;
		}
		return (num % 10) * product(num / 10);
	}
}
