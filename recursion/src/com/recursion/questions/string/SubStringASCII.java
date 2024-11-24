package com.recursion.questions.string;

public class SubStringASCII {
	public static void main(String[] args) {
		subStringWithAscii("abc", "");
	}

	public static void subStringWithAscii(String str, String res) {
		if (str.isEmpty()) {

			System.out.println(res);

			return;
		}
		subStringWithAscii(str.substring(1), res + str.charAt(0));
		subStringWithAscii(str.substring(1), res);
		subStringWithAscii(str.substring(1), res + (str.charAt(0) + 0));
	}

}
