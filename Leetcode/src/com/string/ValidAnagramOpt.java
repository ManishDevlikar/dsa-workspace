package com.string;

public class ValidAnagramOpt {
	public static void main(String[] args) {
		System.out.println(isAnagram("rat", "nar"));
	}

	public static boolean isAnagram(String s, String t) {
		if (s == "" || t == "" || s.length() != t.length())
			return false;
		char[] count = new char[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
