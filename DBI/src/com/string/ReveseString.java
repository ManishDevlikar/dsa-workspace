package com.string;

public class ReveseString {
	public static void main(String[] args) {
		String str = "java is a server side programming language";

		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		String[] arr = str.split(" ");
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			res = arr[i] + " " + res;
		}
		return res.strip();
	}
}
