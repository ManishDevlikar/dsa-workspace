package com.practice.string;

public class ReverseStringWords {
	public static void main(String[] args) {
		String s = "my name is manish";
		String res = reverse(s);
		System.out.println(s);
		System.out.println(res);

	}

	public static String reverse(String str) {
		String[] strArr = str.split(" ");
		int start = 0;
		int end = strArr.length - 1;
		while (start < end) {
			String temp = strArr[start];
			strArr[start] = strArr[end];
			strArr[end] = temp;
			start++;
			end--;
		}
		return String.join(" ", strArr);
	}
}
