package com.basic;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(818));
	}

	public static boolean isPalindrome(int num) {
		int res = 0;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			res = rem + (res * 10);
			num = num / 10;
		}
		if (temp == res)
			return true;
		else
			return false;
	}
}
