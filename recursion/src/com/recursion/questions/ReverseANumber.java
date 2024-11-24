package com.recursion.questions;

public class ReverseANumber {
	public static void main(String[] args) {
		int res = reverse(123);
		System.out.println(res);

		int res2 = reverseRec(123);
		System.out.println(res2);

		int res3 = (int) reverseRec2(123, 2);
		System.out.println(res3);

		int res4 = reverseRec3(123);
		System.out.println(res4);
//		System.out.println((int) Math.log10(123));
	}

	public static int reverse(int num) {
		int res = 0;

		while (num != 0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}

	static int sum = 0;

	public static int reverseRec(int num) {
		if (num == 0) {
			return sum;
		}
		int mod = num % 10;
		sum = sum * 10 + mod;
		return reverseRec(num / 10);
	}

	public static double reverseRec2(int num, int power) {
		if (num <= 1) {
			return num;
		}
		return (num % 10 * Math.pow(10, power)) + reverseRec2(num / 10, power - 1);
	}

	public static int reverseRec3(int num) {
		if (num <= 1) {
			return num;
		}
		int expo = (int) Math.log10(num);
		return (int) (num % 10 * Math.pow(10, expo)) + reverseRec3(num / 10);
	}
}
