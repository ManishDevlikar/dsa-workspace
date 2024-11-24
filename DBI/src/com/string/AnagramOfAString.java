package com.string;

public class AnagramOfAString {
	public static void main(String[] args) {
		isAnagram("abcd", "DCBA");
	}

	public static void isAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			str1 = str1.toUpperCase();
			str1 = getSorted(str1);
			str2 = getSorted(str2);
			str2 = str2.toUpperCase();
			boolean flag = false;

			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					flag = true;
					break;
				} else {
					continue;
				}
			}
			if (flag) {
				System.out.println("String is not anagrom");
			} else {
				System.out.println("String anagram");
			}

		} else {
			System.out.println("String is not anagram");
		}
	}

	public static String getSorted(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);
	}
}
