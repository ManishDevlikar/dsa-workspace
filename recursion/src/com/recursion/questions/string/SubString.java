package com.recursion.questions.string;

import java.util.ArrayList;

public class SubString {
	public static void main(String[] args) {
//		sub("abc", "");
		System.out.println(sub2("abc", ""));
	}

	public static void sub(String str, String res) {
		if (str.isEmpty()) {
			System.out.println(res);
			return;
		}
		char ch = str.charAt(0);
		sub(str.substring(1), res + ch);
		sub(str.substring(1), res);
	}

	public static ArrayList<String> sub2(String str, String resStr) {
		if (str.isEmpty()) {
			ArrayList<String> res = new ArrayList<String>();
			res.add(resStr);
			return res;
		}

		char ch = str.charAt(0);
		ArrayList<String> left = sub2(str.substring(1), resStr + ch);
		ArrayList<String> right = sub2(str.substring(1), resStr);
		left.addAll(right);
		return left;
	}
}
