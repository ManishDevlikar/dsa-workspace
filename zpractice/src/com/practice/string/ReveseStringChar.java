package com.practice.string;

public class ReveseStringChar {
	public static void main(String[] args) {
		String str = "my name is manish";
		System.out.println(reverseChar(str));
		System.out.println(reverse(str));
	}

	public static String reverseChar(String str) {
		String strArr[] = str.split(" ");

		for (int i = 0; i < strArr.length; i++) {
			String s = strArr[i];
			char[] chArr = s.toCharArray();
			int start = 0;
			int end = chArr.length - 1;
			while (start < end) {
				char temp = chArr[start];
				chArr[start] = chArr[end];
				chArr[end] = temp;
				start++;
				end--;
			}
			strArr[i] = new String(chArr);
		}
		return String.join(" ", strArr);
	}

	public static String reverse(String str) {
		char[] chArr = str.toCharArray();
		int start = 0;
		int end = chArr.length - 1;
		while (start < end) {
			char temp = chArr[start];
			chArr[start] = chArr[end];
			chArr[end] = temp;
			start++;
			end--;
		}
		return new String(chArr);
	}
}
