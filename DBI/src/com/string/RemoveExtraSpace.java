package com.string;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		removeExtraSpaces(" hii  there  how are you");
	}

	public static void removeExtraSpaces(String str) {
		StringBuilder result = new StringBuilder();
		boolean isSpace = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' || !isSpace) {
				result.append(str.charAt(i));
				isSpace = (str.charAt(i) == ' ');
			}
		}
		System.out.println(result);
	}
}
