package com.string;

/*
 5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */
public class LongestPalindromicSubstring5 {
	static int start, max;

	public static void main(String[] args) {
		System.out.println(getLongestPalindromicSubString("babda"));
	}

	public static String getLongestPalindromicSubString(String s) {
		if (s.length() < 2) {
			return s;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			expand(s, i, i);
			expand(s, i, i + 1);
		}

		return s.substring(start, max + start);
	}

	private static void expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		if (max < right - left - 1) {
			start = left + 1;
			max = right - left - 1;
		}
	}
}
