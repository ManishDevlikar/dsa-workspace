package com.string;

public class ReverseStringWords {
	public static void main(String[] args) {
		String str = "java is a programming language";

		System.out.println(getReveseStringWord(str));
	}

	public static String getReveseStringWord(String str) {
		String[] arr = str.split(" ");

		String res = "";
		for (int i = 0; i < arr.length; i++) {
			String current = getReverse(arr[i]);
			res += current + " ";
		}
		return res.strip();
	}

	public static String getReverse(String str) {
		String current = "";
		for (int j = 0; j < str.length(); j++) {
			current = str.charAt(j) + current;
		}
		return current;
	}
}
