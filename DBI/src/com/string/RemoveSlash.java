package com.string;

public class RemoveSlash {
	public static void main(String[] args) {
		removeIt("/ manish is / a/");
	}

	public static void removeIt(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '/') {
				continue;
			} else {
				result = result + str.charAt(i);
			}
		}
// removing extra spaces
		String finalRes = "";
		boolean isSpace = false;
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != ' ' || !isSpace) {
				finalRes = finalRes + result.charAt(i);
				isSpace = (result.charAt(i) == ' ');
			}
		}

		System.out.println(finalRes);
	}
}
