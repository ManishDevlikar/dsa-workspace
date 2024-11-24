package com.recursion.questions.string;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {
	public static void main(String[] args) {
//		changeDigitToChar("123");
		getPermutations("12", "");
		System.out.println(getPermutationList("12", ""));
		System.out.println(getPermutationCount("12", ""));
	}

	public static void getPermutations(String digitStr, String res) {
		if (digitStr.isEmpty()) {
			System.out.println(res);
			return;
		}
		int digit = digitStr.charAt(0) - '0';
		for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
			char ch = (char) ('a' + i);
			if (i == 26) {
				return;
			}
			getPermutations(digitStr.substring(1), res + ch);
		}
	}

	public static ArrayList<String> getPermutationList(String str, String res) {
		ArrayList<String> list = new ArrayList<String>();
		if (str.isEmpty()) {
			list.add(res);
			return list;
		}
		int digit = str.charAt(0) - '0';
		for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
			char ch = (char) ('a' + i);
			if (i == 26) {
				return list;
			}
			list.addAll(getPermutationList(str.substring(1), res + ch));
		}
		return list;
	}

	public static int getPermutationCount(String str, String res) {
		if (str.isEmpty()) {
			return 1;
		}
		int count = 0;
		int digit = str.charAt(0) - '0';
		for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
			char ch = (char) ('a' + i);
			if (i == 26) {
				return count;
			}
			count += getPermutationCount(str.substring(1), res + ch);
		}
		return count;
	}

	public static void changeDigitToChar(String digit) {
		for (int j = 0; j < digit.length(); j++) {
			for (int i = (((digit.charAt(j) - '0') - 1) * 3); i < ((digit.charAt(j) - '0') * 3); i++) {
				if (i == 26)
					return;
				System.out.println((char) ('a' + i));
			}
		}
	}
}
