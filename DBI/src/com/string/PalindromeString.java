package com.string;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println(isPalindrome("pop"));
	}

	public static boolean isPalindrome(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++)
			temp = str.charAt(i) + temp;
		if (temp.equalsIgnoreCase(str))
			return true;
		else
			return false;

	}
}
