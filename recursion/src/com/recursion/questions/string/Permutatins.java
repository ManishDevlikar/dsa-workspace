package com.recursion.questions.string;

import java.util.ArrayList;

public class Permutatins {
	public static void main(String[] args) {
		System.out.println(permutation("abc", "").toString());
		System.out.println(permutationCount("abc", ""));
		System.out.println(permutataion2("abc", "", 0));
	}

	public static ArrayList<String> permutation(String str, String ans) {
		ArrayList<String> resList = new ArrayList<String>();
		if (str.isEmpty()) {
			resList.add(ans);
			return resList;
		}

		char ch = str.charAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			String f = ans.substring(0, i);
			String s = ans.substring(i, ans.length());
			resList.addAll(permutation(str.substring(1), f + ch + s));
		}
		return resList;
	}

	public static int permutationCount(String str, String ans) {
		if (str.isEmpty()) {
			return 1;
		}
		int count = 0;
		char ch = str.charAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			String f = ans.substring(0, i);
			String s = ans.substring(i, ans.length());
			count += permutationCount(str.substring(1), f + ch + s);

		}
		return count;
	}

	public static int permutataion2(String str, String res, int count) {
		if (str.isEmpty()) {
			return count + 1;
		}
		char ch = str.charAt(0);
		for (int i = 0; i <= res.length(); i++) {
			String f = res.substring(0, i);
			String s = res.substring(i, res.length());
			count = permutataion2(str.substring(1), f + ch + s, count);

		}
		return count;
	}
}
