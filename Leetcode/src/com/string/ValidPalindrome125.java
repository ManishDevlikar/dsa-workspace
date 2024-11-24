package com.string;

public class ValidPalindrome125 {
	public static void main(String[] args) {

		System.out.println(isValidPalindrome("0P"));
	}

	private static boolean isValidPalindrome(String str) {

		str = str.replaceAll("[^a-zA-z0-9]", "");
		str = str.toLowerCase();

		char c[] = str.toCharArray();
		int start = 0;
		int end = c.length - 1;

		while (start < end) {
			char temp = c[end];
			c[end] = c[start];
			c[start] = temp;
			start++;
			end--;
		}
		String resultStr = String.valueOf(c);

		return str.equalsIgnoreCase(resultStr);
	}
}
