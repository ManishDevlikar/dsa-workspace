package com.string;

/*
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

// this will give time limit exit for large size string value
public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("cat", "vac"));
	}

	public static boolean isAnagram(String s, String t) {
		if (s == "" || t == "" || s.length() != t.length())
			return false;
		String s1 = sort(s);
		String t1 = sort(t);
		System.out.println(s1);
		System.out.println(t1);
		for (int i = 0; i < s.length(); i++) {
			if (s1.charAt(i) != (t1.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String sort(String s) {
		char[] c = s.toCharArray();

		for (int i = 1; i < c.length; i++) {
			int min = i;
			while (min > 0 && c[min] < c[min - 1]) {
				char temp = c[min - 1];
				c[min - 1] = c[min];
				c[min] = temp;
				min--;
			}
		}
		return new String(c);
	}

}
