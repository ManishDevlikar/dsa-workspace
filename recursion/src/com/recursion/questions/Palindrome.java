package com.recursion.questions;

public class Palindrome {
	public static void main(String[] args) {

		System.out.println(isPalindrome(121));
	}

	public static int reverse(int num) {
		if (num <= 1) {
			return num;
		}
		int expo = (int) Math.log10(num);
		return (int) (num % 10 * Math.pow(10, expo)) + reverse(num / 10);
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}
}
